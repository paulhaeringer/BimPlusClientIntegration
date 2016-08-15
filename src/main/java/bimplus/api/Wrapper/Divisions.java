/*
 * Copyright (c) 2016 Cornelius Preidel
 *         Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *         The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *         THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package bimplus.api.Wrapper;

import bimplus.api.ApiCore;
import bimplus.data.DtoDivision;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Cornelius on 03.08.2016.
 */
public class Divisions extends BaseWrapper
{
    private static final Logger LOG = LoggerFactory.getLogger(Divisions.class);

    public Divisions(ApiCore core)
    {
        super(core);
    }

    public List<DtoDivision> GetDivisions(String projectId)
    {
        try
        {
            String json = core.connection.sendGetRequest( core.GetV2TeamUrl() + "/projects/" + projectId + "/divisions");
            return core.mapper.readValue(json, core.mapper.getTypeFactory().constructCollectionType(List.class, DtoDivision.class));
        }
        catch(IOException e)
        {
            LOG.error(e.getMessage(), e);
        }
        return null;
    }

    public DtoDivision GetDivision(String divisionId)
    {
        try
        {
            String json = core.connection.sendGetRequest( core.GetV2TeamUrl() + "/divisions/" + divisionId);
            return core.mapper.readValue(json, DtoDivision.class);
        }
        catch(IOException e)
        {
            LOG.error(e.getMessage(), e);
        }
        return null;
    }

    public void CreateNewDivision(String projectId, DtoDivision division)
    {
        try
        {
            // Convert to JSON
            String jsonInString = core.mapper.writeValueAsString(division);
            String json = core.connection.sendPostRequest(core.GetV2TeamUrl() + "/projects/" + projectId + "/divisions", jsonInString);
        }
        catch(IOException e)
        {
            LOG.error(e.getMessage(), e);
        }
    }

    public Boolean DeleteDivision(String divisionId)
    {
        try
        {
            return core.connection.sendDeleteRequest(core.GetV2TeamUrl() + "/divisions/" + divisionId);
        }
        catch(IOException e)
        {
            LOG.error(e.getMessage(), e);
        }
        return false;
    }

    public boolean PutDivision(String divisionId, DtoDivision division)
    {
        try
        {
            // Convert to JSON
            String jsonInString = core.mapper.writeValueAsString(division);
            String json = core.connection.sendPutRequest(core.GetV2TeamUrl() + "/divisions/" + divisionId, jsonInString);
            return true;
        }
        catch(IOException e)
        {
            LOG.error(e.getMessage(), e);
        }
        return false;
    }

    public String DownloadDivisionAsString(String divisionId)
    {
        try
        {
            InputStream stream = core.connection.sendDownloadRequest( core.GetV2TeamUrl() + "/divisions/" + divisionId + "/download?api-token=" + core.connection.access_token);

            return core.connection.sendGetRequest( core.GetV2TeamUrl() + "/divisions/" + divisionId + "/download?api-token=" + core.connection.access_token);
        }
        catch(IOException e)
        {
            LOG.error(e.getMessage(), e);
        }
        return null;
    }

    public InputStream DownloadDivisionAsStream(String divisionId)
    {
        try
        {
            return core.connection.sendDownloadRequest( core.GetV2TeamUrl() + "/divisions/" + divisionId + "/download?api-token=" + core.connection.access_token);
        }
        catch(IOException e)
        {
           LOG.error(e.getMessage(), e);
        }
        return null;

    }

    public void ExportModelAsIFC(String projectId, String divisionID)
    {
            // Convert to JSON
            // String jsonInString = core.mapper.writeValueAsString(issue);
            String json = core.connection.sendPostRequest(core.GetV2TeamUrl() + "/projects/" + projectId + "/model/" + divisionID + "/exportasync", "");
    }
}
