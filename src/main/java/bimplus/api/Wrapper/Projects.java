/*
 * Copyright (c) 2016 Cornelius Preidel
 *         Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *         The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *         THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package bimplus.api.Wrapper;

import bimplus.api.ApiCore;
import bimplus.data.DtoProject;
import bimplus.data.DtoTopology;
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
            return core.mapper.readValue(json, core.mapper.getTypeFactory().constructCollectionType(List.class, DtoProject.class));
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

    public Boolean DeleteProject(String projectId)
    {
        try
        {
            // Convert to JSON
            return core.connection.sendDeleteRequest(core.GetV2TeamUrl() + "/projects/" + projectId);
        }
        catch(IOException e)
        {
            LOG.error(e.getMessage(), e);
        }
        return false;
    }

    public DtoTopology GetProjectTopology(String projectId)
    {
        try
        {
            String json = core.connection.sendGetRequest( core.GetV2TeamUrl() + "/projects/" + projectId + "/topology");
            return core.mapper.readValue(json, DtoTopology.class);
        }
        catch(IOException e)
        {
            LOG.error(e.getMessage(), e);
        }
        return null;
    }
}
