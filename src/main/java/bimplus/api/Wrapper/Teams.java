package bimplus.api.Wrapper;

import bimplus.api.ApiCore;
import bimplus.data.DtoTeam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

/**
 * Created by Cornelius on 03.08.2016.
 */
public class Teams extends BaseWrapper
{
    private static final Logger LOG = LoggerFactory.getLogger(Teams.class);
    
    public Teams(ApiCore core)
    {
        super(core);
    }

    public List<DtoTeam> GetTeams()
    {
        try
        {
            String json = core.connection.sendGetRequest( core.connection.host.getServerName() + "/v2/teams");
            // Mapping mechanism
            // ObjectMapper mapper = new ObjectMapper();
            return core.mapper.readValue(json, core.mapper.getTypeFactory().constructCollectionType(List.class, DtoTeam.class));
        }
        catch(IOException e)
        {
           LOG.error(e.getMessage(), e);
        }
        return null;
    }

}
