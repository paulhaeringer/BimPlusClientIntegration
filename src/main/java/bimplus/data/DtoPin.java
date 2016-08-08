package bimplus.data;

import org.codehaus.jackson.annotate.JsonProperty;
import org.joda.time.DateTime;

/**
 * Created by Cornelius on 05.08.2016.
 */
public class DtoPin extends BaseDto
{
    @JsonProperty("issueId")
    private String IssueId = "";
    public final String getIssueId()
    {
        return IssueId;
    }
    public final void setIssueId(String value)
    {
        IssueId = value;
    }

    @JsonProperty("objectId")
    private String ObjectId = "";
    public final String getObjectId()
    {
        return ObjectId;
    }
    public final void setObjectId(String value)
    {
        ObjectId = value;
    }

    @JsonProperty("topologyNodeId")
    private String TopologyNodeId = null;
    public final String getTopologyNodeId()
    {
        return TopologyNodeId;
    }
    public final void setTopologyNodeId(String value)
    {
        TopologyNodeId = value;
    }

    @JsonProperty("position")
    private DtoPosition Position;
    public final DtoPosition getPosition()
    {
        return Position;
    }
    public final void setPosition(DtoPosition value)
    {
        Position = value;
    }

    @JsonProperty("normalVector")
    private DtoPosition NormalVector;
    public final DtoPosition getNormalVector()
    {
        return NormalVector;
    }
    public final void setNormalVector(DtoPosition value)
    {
        NormalVector = value;
    }

    @JsonProperty("createdAt")
    private DateTime Timestamp = DateTime.now();
    public final DateTime getTimestamp()
    {
        return Timestamp;
    }
    public final void setTimestamp(DateTime value)
    {
        Timestamp = value;
    }


}
