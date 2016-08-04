package bimplus.api.Wrapper;

import bimplus.api.ApiCore;
import bimplus.data.DtoAttachment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

/**
 * Created by Cornelius on 03.08.2016.
 */
public class Attachments extends BaseWrapper
{
    private static final Logger LOG = LoggerFactory.getLogger(Attachments.class);

    public Attachments(ApiCore core)
    {
        super(core);
    }

    public List<DtoAttachment> GetAttachments(String projectID)
    {
        try
        {
            String json = core.connection.sendGetRequest( core.GetV2TeamUrl() + "/projects/" + projectID + "/attachmentsTEST");
            List<DtoAttachment> attachments = core.mapper.readValue(json, core.mapper.getTypeFactory().constructCollectionType(List.class, DtoAttachment.class));
            return attachments;
        }
        catch(IOException e)
        {
            LOG.error(e.getMessage(), e);
        }

        return null;
    }

    public void CreateAttachment(String projectID, DtoAttachment attachment)
    {
        try
        {
            // Convert to JSON
            String jsonInString = core.mapper.writeValueAsString(attachment);
            String json = core.connection.sendPostRequest(core.GetV2TeamUrl() + "/projects", jsonInString);
        }
        catch(IOException e)
        {
            LOG.error(e.getMessage(), e);
        }
    }
}
