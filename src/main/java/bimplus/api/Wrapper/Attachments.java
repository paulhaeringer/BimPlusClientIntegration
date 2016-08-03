package bimplus.api.Wrapper;

import bimplus.api.ApiCore;
import bimplus.data.DtoAttachment;

import java.io.IOException;
import java.util.List;

/**
 * Created by Cornelius on 03.08.2016.
 */
public class Attachments extends BaseWrapper
{

    public Attachments(ApiCore core)
    {
        super(core);
    }

    public List<DtoAttachment> GetAttachments(String projectID)
    {
        try
        {
            String json = core.connection.sendGetRequest( core.GetV2TeamUrl() + "/projects/" + projectID + "/attachments");
            List<DtoAttachment> attachments = core.mapper.readValue(json, core.mapper.getTypeFactory().constructCollectionType(List.class, DtoAttachment.class));
            return attachments;
        }
        catch(IOException e)
        {
            core._exceptionList.add(e.getMessage());
        }
        return null;
    }
}
