package bimplus.api.Wrapper;

import bimplus.api.ApiCore;
import bimplus.data.DtoProject;

import java.io.IOException;
import java.util.List;

/**
 * Created by Cornelius on 03.08.2016.
 */
public class Projects extends BaseWrapper
{
    public Projects(ApiCore core)
    {
        super(core);
    }

    public List<DtoProject> GetProjects()
    {
        try
        {
            String json = core.connection.sendGetRequest( core.GetV2TeamUrl() + "/projects");
            List<DtoProject> projects = core.mapper.readValue(json, core.mapper.getTypeFactory().constructCollectionType(List.class, DtoProject.class));
            return projects;
        }
        catch(IOException e)
        {
            core._exceptionList.add(e.getMessage());
        }
        return null;
    }

    public void CreateNewProject(DtoProject project)
    {
        try
        {
            // Convert to JSON
            String jsonInString = core.mapper.writeValueAsString(project);
            String json = core.connection.sendPostRequest(core.GetV2TeamUrl() + "/projects", jsonInString);
        }
        catch(IOException e)
        {
            core._exceptionList.add(e.getMessage());
        }
    }
}
