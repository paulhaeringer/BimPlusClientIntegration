/*
 * Copyright (c) 2016 Cornelius Preidel
 *         Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *         The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *         THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package bimplus.utilities;

import bimplus.api.BimPlusHost;
import bimplus.api.ServerName;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Cornelius on 05.08.2016.
 */
public class LoginSettings
{
    public String password;
    public String username;
    public String serverName;
    public Boolean rememberMe;

    public LoginSettings()
    {
    }

    public void SaveLoginSettings(String _username, String _password, BimPlusHost _host, Boolean _rememberMe)
    {
        password = _password;
        username = _username;
        rememberMe = _rememberMe;
        serverName = _host.getServerName();

        try
        {
            // Save Settings
            Properties saveProps = new Properties();
            saveProps.setProperty("username", username);
            saveProps.setProperty("password", password);
            saveProps.setProperty("serverName", serverName);
            saveProps.setProperty("rememberMe", rememberMe.toString());
            saveProps.storeToXML(new FileOutputStream("settings.xml"), "");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Boolean GetLoginSettings()
    {
        // Load Settings
        Properties loadProps = new Properties();
        try
        {
            loadProps.loadFromXML(new FileInputStream("settings.xml"));
            username = loadProps.getProperty("username");
            password = loadProps.getProperty("password");
            serverName = loadProps.getProperty("serverName");
            rememberMe = Boolean.valueOf(loadProps.getProperty("FileOutputStream"));
            return true;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

    public void DeleteLoginSettings()
    {
        // Delete Settings File ...
    }
}
