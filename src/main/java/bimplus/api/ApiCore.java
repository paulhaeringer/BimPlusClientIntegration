package bimplus.api;

import bimplus.data.*;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Cornelius on 03.08.2016.
 */
public class ApiCore
{
    public Connection connection;
    public List<String> _exceptionList;
    private String teamSlug;
    public ObjectMapper mapper;
    public Boolean connected = false;

    public ApiCore(String username, String password, BimPlusHost host)
    {
        // Init Mapper
        mapper = new ObjectMapper();

        // Connection
        connection = new Connection();
        connected = connection.Connect(username, password, host);
    }

    public String GetV2TeamUrl()
    {
        return connection.host.getServerName() + "/v2/" + teamSlug;
    }

    public void SetTeamSlug(String slug)
    {
        this.teamSlug = slug;
    }
}




