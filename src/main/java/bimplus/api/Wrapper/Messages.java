package bimplus.api.Wrapper;

import bimplus.api.ApiCore;
import bimplus.data.DtoMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Created by Cornelius on 05.08.2016.
 */
class Messages extends BaseWrapper
{
    private static final Logger LOG = LoggerFactory.getLogger(Issues.class);

    public Messages(ApiCore core)
    {
        super(core);
    }

    public void CreateMessage(DtoMessage message)
    {
        try
        {
            // Convert to JSON
            String jsonInString = core.mapper.writeValueAsString(message);
            String json = core.connection.sendPostRequest(core.GetV2Url() + "/messages", jsonInString);
        }
        catch(IOException e)
        {
            LOG.error(e.getMessage(), e);
        }
    }
}
