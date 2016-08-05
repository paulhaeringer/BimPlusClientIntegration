package bimplus.api.Wrapper;

import bimplus.api.ApiCore;
import bimplus.data.DtObject;
import bimplus.data.DtoTopology;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
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

    public DtoTopology GetObjects(String topologyId)
    {
        // try
        // {
        //     String json = core.connection.sendGetRequest( core.GetV2TeamUrl() + "/objects/" + topologyId + "/geometries/threejs");
        //     DtoTopology topology = core.mapper.readValue(json, DtoTopology.class);
        //     return topology;
        // }
        // catch(IOException e)
        // {
        //    LOG.error(e.getMessage(), e);
        // };
        // return null;
        return null;
    }
}
