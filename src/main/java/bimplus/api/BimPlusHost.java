/**
 * Created by Cornelius on 02.08.2016.
 */
package bimplus.api;

public class BimPlusHost
{
    /**
     Base BimPlus Url.
     */
    public final String getServerName()
    {
        switch (getBimPlusEnvironment())
        {
            case Prod:
                return "https://api.bimplus.net";
            case Stage:
                return "https://api-stage.bimplus.net";
            case Dev:
                return "https://api-dev.bimplus.net";
            case LocalHost:
                return "http://localhost/bimplus.server.web";
            default:
                return "https://api.bimplus.net";
        }
    }
    public final void setServerName(String value)
    {
        if (value.contains("api-dev"))
        {
            setBimPlusEnvironment(BimPlusEnvironment.Dev);
        }
        else if (value.contains("api-stage"))
        {
            setBimPlusEnvironment(BimPlusEnvironment.Stage);
        }
        else if (value.contains("localhost"))
        {
            setBimPlusEnvironment(BimPlusEnvironment.LocalHost);
        }
        else
        {
            setBimPlusEnvironment(BimPlusEnvironment.Prod);
        }
    }

    /**
     Save the short server name.
     */
    private ServerName BimPlusEnvironment = getBimPlusEnvironment().values()[0];
    public final ServerName getBimPlusEnvironment()
    {
        return BimPlusEnvironment;
    }
    public final void setBimPlusEnvironment(ServerName value)
    {
        BimPlusEnvironment = value;
    }
}
