package bimplus.api.Wrapper;

import bimplus.api.ApiCore;
import bimplus.data.DtoTeam;

import java.io.IOException;
import java.util.List;

/**
 * Created by Cornelius on 03.08.2016.
 */
public class Teams extends BaseWrapper
{
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
            java.util.List<bimplus.data.DtoTeam> teams = core.mapper.readValue(json, core.mapper.getTypeFactory().constructCollectionType(List.class, bimplus.data.DtoTeam.class));
            return teams;
        }
        catch(IOException e)
        {
            core._exceptionList.add(e.getMessage());
        }
        return null;
    }

}
