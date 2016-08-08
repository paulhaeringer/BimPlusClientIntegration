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
