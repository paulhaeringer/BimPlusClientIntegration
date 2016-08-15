/*
 * Copyright (c) 2016 Cornelius Preidel
 *         Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *         The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *         THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package bimplus.api;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
// JSON Stuff
import org.json.JSONObject;
import org.json.JSONTokener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Cornelius on 02.08.2016.
 */
public class Connection
{
    private static final Logger LOG = LoggerFactory.getLogger(Connection.class);

    private HttpURLConnection connection;
    public String access_token = "";
    private final String AuthorizationTokenType = "BimPlus";
    public BimPlusHost host;

    public Boolean Connect(String username, String password, BimPlusHost _host)
    {
        // Init
        host = _host;

        String payload="{\"user_id\":\"" + username + "\",\"password\":\"" + password + "\"}";
        // String requestUrl= host + "https://api-dev.bimplus.net/v2/authorize";
        String requestUrl= host.getServerName() + "/v2/authorize";
        String jsonString = sendPostRequest(requestUrl, payload);

        if(jsonString == null)
            return false;

        // Analyse the access token
        JSONTokener token = new JSONTokener(jsonString);
        JSONObject root = new JSONObject(token);

        access_token = (String) root.get("access_token");

        if(access_token != null)
        {
            return true;
        }

        LOG.error("Login Routine failed!");
        return false;
    }

    public String sendPostRequest(String requestUrl, String payload)
    {
        StringBuffer jsonString;
        try
        {
            URL url = new URL(requestUrl);
            connection = (HttpURLConnection) url.openConnection();

            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");

            if(access_token != null)
                connection.setRequestProperty("Authorization", "BimPlus " + access_token);

            OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream(), "UTF-8");
            writer.write(payload);
            writer.close();
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            jsonString = new StringBuffer();
            String line;
            while ((line = br.readLine()) != null)
            {
                jsonString.append(line);
            }
            br.close();
            connection.disconnect();
        }
        catch (Exception e)
        {
            LOG.error(e.getMessage(), e);
            return null;
        }
        return jsonString.toString();
    }

    public String sendPutRequest(String requestUrl, String payload)
    {
        StringBuffer jsonString;
        try
        {
            URL url = new URL(requestUrl);
            connection = (HttpURLConnection) url.openConnection();

            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setRequestMethod("PUT");
            connection.setRequestProperty("Content-Type", "application/json");
            if(access_token != null)
                connection.setRequestProperty("Authorization", "BimPlus " + access_token);

            OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream(), "UTF-8");
            writer.write(payload);
            writer.close();
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            jsonString = new StringBuffer();
            String line;
            while ((line = br.readLine()) != null)
            {
                jsonString.append(line);
            }
            br.close();
            connection.disconnect();
        }
        catch (Exception e)
        {
            LOG.error(e.getMessage(), e);
            return null;
        }
        return jsonString.toString();
    }

    public String sendGetRequest(String requestUrl) throws IOException
    {

        URL url = new URL(requestUrl);
        connection = (HttpURLConnection) url.openConnection();

        // optional default is GET
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Authorization", AuthorizationTokenType + " " + access_token);

        int responseCode = connection.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        return response.toString();
    }

    public Boolean sendDeleteRequest(String requestUrl) throws IOException
    {
        URL url = new URL(requestUrl);
        connection = (HttpURLConnection) url.openConnection();

        // optional default is GET
        connection.setRequestMethod("DELETE");
        connection.setRequestProperty("Authorization", AuthorizationTokenType + " " + access_token);

        int responseCode = connection.getResponseCode();

        LOG.info("\nSending 'DELETE' request to URL : " + url);
        LOG.info("Response Code : " + responseCode);

        // System.out.println("\nSending 'DELETE' request to URL : " + url);
        // System.out.println("Response Code : " + responseCode);

        if(responseCode == 200)
            return true;
        return false;
    }

    public InputStream sendDownloadRequest(String requestUrl) throws IOException
    {
        URL url = new URL(requestUrl);
        connection = (HttpURLConnection) url.openConnection();

        // optional default is GET
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Content-Type", "octet-stream");
        connection.setRequestProperty("Authorization", AuthorizationTokenType + " " + access_token);
        connection.setDoInput(true);

        int responseCode = connection.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        return connection.getInputStream();
    }

    public String sendHeadRequest(String requestUrl) throws IOException
    {
        URL url = new URL(requestUrl);
        connection = (HttpURLConnection) url.openConnection();

        // optional default is GET
        connection.setRequestMethod("HEAD");
        connection.setRequestProperty("Authorization", AuthorizationTokenType + " " + access_token);

        int responseCode = connection.getResponseCode();
        System.out.println("\nSending 'HEAD' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        return response.toString();
    }

    // TODO
    public Boolean ValidateToken(String access_token)
    {
        return true;
    }
}
