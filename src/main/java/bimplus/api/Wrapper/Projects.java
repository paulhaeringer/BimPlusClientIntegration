package bimplus.api.Wrapper;

import bimplus.api.ApiCore;
import bimplus.data.DtoProject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

/**
 * Created by Cornelius on 03.08.2016.
 */
public class Projects extends BaseWrapper
{
    private static final Logger LOG = LoggerFactory.getLogger(Projects.class);
    
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
           LOG.error(e.getMessage(), e);
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
           LOG.error(e.getMessage(), e);
        }
    }
}
