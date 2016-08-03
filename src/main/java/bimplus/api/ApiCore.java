package bimplus.api;

import bimplus.data.DtoDivision;
import bimplus.data.DtoModel;
import bimplus.data.DtoProject;
import bimplus.data.DtoTeam;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.List;

/**
 * Created by Cornelius on 03.08.2016.
 */
public class ApiCore
{
    private Connection connection;
    private List<String> _exceptionList;
    private String teamSlug;
    private ObjectMapper mapper;

    public ApiCore(String username, String password, BimPlusHost host)
    {
        // Init Mapper
        mapper = new ObjectMapper();

        // Connection
        connection = new Connection();
        connection.Connect(username, password, host);
    }

    public String GetV2TeamUrl()
    {
        return connection.host.getServerName() + "/v2/" + teamSlug;
    }

    public List<DtoTeam> GetTeams()
    {
        try
        {
            String json = connection.sendGetRequest( connection.host.getServerName() + "/v2/teams");
            // Mapping mechanism
            // ObjectMapper mapper = new ObjectMapper();
            List<DtoTeam> teams = mapper.readValue(json, mapper.getTypeFactory().constructCollectionType(List.class, DtoTeam.class));
            return teams;
        }
        catch(IOException e)
        {
            _exceptionList.add(e.getMessage());
        }
        return null;
    }

    public List<DtoProject> GetProjects()
    {
        try
        {
            String json = connection.sendGetRequest( GetV2TeamUrl() + "/projects");
            List<DtoProject> projects = mapper.readValue(json, mapper.getTypeFactory().constructCollectionType(List.class, DtoProject.class));
            return projects;
            // return teams;
        }
        catch(IOException e)
        {
            _exceptionList.add(e.getMessage());
        }
        return null;
    }

    public List<DtoDivision> GetModels(String projectId)
    {
        try
        {
            String json = connection.sendGetRequest( GetV2TeamUrl() + "/projects/" + projectId + "/divisions");
            List<DtoDivision> models = mapper.readValue(json, mapper.getTypeFactory().constructCollectionType(List.class, DtoDivision.class));
            return models;
        }
        catch(IOException e)
        {
            _exceptionList.add(e.getMessage());
        }
        return null;
    }

    public String DownloadDivision(String divisionId)
    {
        https://api-stage.bimplus.net/v2/<team_slug>/divisions/<division_id>/download?api-token=token

        try
        {
            return connection.sendGetRequest( GetV2TeamUrl() + "/divisions/" + divisionId + "/download?api-token=" + connection.access_token);
        }
        catch(IOException e)
        {
            _exceptionList.add(e.getMessage());
        }
        return null;

    }

    public void SetTeamSlug(String slug)
    {
        this.teamSlug = slug;
    }
}




