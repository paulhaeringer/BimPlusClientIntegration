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
