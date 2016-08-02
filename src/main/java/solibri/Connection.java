package solibri;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/**
 * Created by Cornelius on 02.08.2016.
 */
public class Connection
{
    public void Start()
    {

        String payload="{\"user_id\":\"cornelius.preidel@googlemail.com\",\"password\":\"germany\"}";
        String requestUrl="https://api-dev.bimplus.net/v2/authorize";
        sendPostRequest(requestUrl, payload);


        try
        {
            URL url = new URL("https://api-dev.bimplus.net/v2/authorize");

            HttpURLConnection conn = (HttpURLConnection) url
                    .openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");

            conn.setFixedLengthStreamingMode(75);

            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("user_id", "cornelius.preidel@googlemail.com");
            conn.setRequestProperty("password", "germany");

            System.out.println("Method: " + conn.getRequestMethod());
            System.out.println("Content type: " + conn.getRequestProperty("Content-Type"));

            if (conn.getResponseCode() != 200)
            {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            // BufferedReader br = new BufferedReader(new InputStreamReader(
            //     (conn.getInputStream())));
//
            // String output;
            // System.out.println("Output from Server .... \n");
            // while ((output = br.readLine()) != null)
            // {
            //     System.out.println(output);
            // }

            conn.disconnect();
        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }



    }

    public static String sendPostRequest(String requestUrl, String payload)
    {
        StringBuffer jsonString;
        try
        {
            URL url = new URL(requestUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setDoInput(true);
            connection.setDoOutput(true);

            connection.setRequestProperty("Content-Type", "application/json");

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
            throw new RuntimeException(e.getMessage());
        }
        return jsonString.toString();
    }
}
