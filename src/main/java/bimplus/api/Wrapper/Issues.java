package bimplus.api.Wrapper;

import bimplus.api.ApiCore;
import bimplus.data.DtoIssue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

/**
 * Created by Cornelius on 03.08.2016.
 */
public class Issues extends BaseWrapper
{
    private static final Logger LOG = LoggerFactory.getLogger(Issues.class);
    
    public Issues(ApiCore core)
    {
        super(core);
    }

    public List<DtoIssue> GetIssues(String projectID)
    {
        try
        {
            String json = core.connection.sendGetRequest( core.GetV2TeamUrl() + "/projects/" + projectID + "/issues");
            return core.mapper.readValue(json, core.mapper.getTypeFactory().constructCollectionType(List.class, DtoIssue.class));
        }
        catch(IOException e)
        {
           LOG.error(e.getMessage(), e);
        }
        return null;
    }

    public void CreateIssue(String projectID, DtoIssue issue)
    {
        try
        {
            // Convert to JSON
            String jsonInString = core.mapper.writeValueAsString(issue);
            String json = core.connection.sendPostRequest(core.GetV2TeamUrl() + "/projects/" + projectID + "/issues", jsonInString);
        }
        catch(IOException e)
        {
           LOG.error(e.getMessage(), e);
        }
    }

    public Boolean DeleteIssue(String issueId)
    {
        try
        {
            // Convert to JSON
            return core.connection.sendDeleteRequest(core.GetV2TeamUrl() + "/issues/" + issueId);
        }
        catch(IOException e)
        {
            LOG.error(e.getMessage(), e);
        }
        return false;
    }
}
