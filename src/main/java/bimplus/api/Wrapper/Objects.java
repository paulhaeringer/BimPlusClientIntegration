package bimplus.api.Wrapper;

import bimplus.api.ApiCore;
import bimplus.data.DtObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by Cornelius on 03.08.2016.
 */
public class Objects extends BaseWrapper
{
    private static final Logger LOG = LoggerFactory.getLogger(Objects.class);
    
    public Objects(ApiCore core)
    {
        super(core);
    }

    public List<DtObject> GetObjects(String projectId, String divisionId)
    {
        return null;
       // try
       // {
       //     String json = core.connection.sendGetRequest( core.GetV2TeamUrl() + "/projects/" + projectId + "/divisions/" + divisionId + "/objects");
       //     List<DtObject> objects = core.mapper.readValue(json, core.mapper.getTypeFactory().constructCollectionType(List.class, DtObject.class));
       //     return projects;
       // }
       // catch(IOException e)
       // {
       //    LOG.error(e.getMessage(), e);
       // }
       // return null;
    }
}
