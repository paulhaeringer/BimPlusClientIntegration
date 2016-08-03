package bimplus.api.Wrapper;

import bimplus.api.ApiCore;
import bimplus.data.DtoDivision;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Cornelius on 03.08.2016.
 */
public class Divisions extends BaseWrapper
{
    public Divisions(ApiCore core)
    {
        super(core);
    }

    public List<DtoDivision> GetDivisions(String projectId)
    {
        try
        {
            String json = core.connection.sendGetRequest( core.GetV2TeamUrl() + "/projects/" + projectId + "/divisions");
            List<DtoDivision> models = core.mapper.readValue(json, core.mapper.getTypeFactory().constructCollectionType(List.class, DtoDivision.class));
            return models;
        }
        catch(IOException e)
        {
            core._exceptionList.add(e.getMessage());
        }
        return null;
    }

    public DtoDivision GetDivision(String divisionId)
    {
        try
        {
            String json = core.connection.sendGetRequest( core.GetV2TeamUrl() + "/divisions/" + divisionId);
            DtoDivision division = core.mapper.readValue(json, DtoDivision.class);
            return division;
        }
        catch(IOException e)
        {
            core._exceptionList.add(e.getMessage());
        }
        return null;
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
            core._exceptionList.add(e.getMessage());
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
            core._exceptionList.add(e.getMessage());
        }
        return null;

    }
}
