package bimplus.api.Wrapper;

import bimplus.api.ApiCore;
import bimplus.data.DtoPin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

/**
 * Created by Cornelius on 05.08.2016.
 */
public class Pins extends BaseWrapper
{
    private static final Logger LOG = LoggerFactory.getLogger(Issues.class);

    public Pins(ApiCore core)
    {
        super(core);
    }

    public List<DtoPin> GetPins(String issueId)
    {
        try
        {
            String json = core.connection.sendGetRequest( core.GetV2TeamUrl() + "/issues/" + issueId + "/pins");
            return core.mapper.readValue(json, core.mapper.getTypeFactory().constructCollectionType(List.class, DtoPin.class));
        }
        catch(IOException e)
        {
            LOG.error(e.getMessage(), e);
        }
        return null;
    }

    public DtoPin GetPinDetails(String pinId)
    {
        try
        {
            String json = core.connection.sendGetRequest( core.GetV2TeamUrl() + "/pins/" + pinId);
            return core.mapper.readValue(json, DtoPin.class);
        }
        catch(IOException e)
        {
            LOG.error(e.getMessage(), e);
        }
        return null;
    }

    public Boolean DeletePin(String pinId)
    {
        try
        {
            // Convert to JSON
            return core.connection.sendDeleteRequest(core.GetV2TeamUrl() + "/pins/" + pinId);
        }
        catch(IOException e)
        {
            LOG.error(e.getMessage(), e);
        }
        return false;
    }
}
