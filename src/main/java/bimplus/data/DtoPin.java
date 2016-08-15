/*
 * Copyright (c) 2016 Cornelius Preidel
 *         Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *         The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *         THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

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
