package bimplus.api.Wrapper;

import bimplus.api.ApiCore;
import bimplus.data.DtoIssue;
import bimplus.data.DtoProject;

import java.io.IOException;
import java.util.List;

/**
 * Created by Cornelius on 03.08.2016.
 */
public class Issues extends BaseWrapper
{
    public Issues(ApiCore core)
    {
        super(core);
    }

    public List<DtoIssue> GetIssues(String projectID)
    {
        try
        {
            String json = core.connection.sendGetRequest( core.GetV2TeamUrl() + "/projects/" + projectID + "/issues");
            List<DtoIssue> issues = core.mapper.readValue(json, core.mapper.getTypeFactory().constructCollectionType(List.class, DtoIssue.class));
            return issues;
        }
        catch(IOException e)
        {
            core._exceptionList.add(e.getMessage());
        }
        return null;
    }

    public void CreateIssue(String projectID, DtoIssue issue)
    {
        try
        {
            // Convert to JSON
            String jsonInString = core.mapper.writeValueAsString(issue);
            String json = core.connection.sendPostRequest(core.GetV2TeamUrl() + "/projects", jsonInString);
        }
        catch(IOException e)
        {
            core._exceptionList.add(e.getMessage());
        }
    }
}
