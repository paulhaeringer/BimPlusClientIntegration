/*
 * Copyright (c) 2016 Cornelius Preidel
 *         Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *         The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *         THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package bimplus.data;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.joda.time.DateTime;

/**
 * Created by Cornelius on 03.08.2016.
 */
public class DtoProject extends BaseDto
{
    @JsonProperty("name")
    private String Name;
    public String getName()
    {
        return Name;
    }
    public void setName(String value)
    {
        Name = value;
    }

    @JsonProperty("shortDescr")
    private String ShortDescription;
    public String getShortDescription()
    {
        return ShortDescription;
    }
    public void setShortDescription(String value)
    {
        ShortDescription = value;
    }

    @JsonProperty("teamName")
    private String TeamName;
    public String getTeamName()
    {
        return TeamName;
    }
    public void setTeamName(String value)
    {
        TeamName = value;
    }

    @JsonProperty("teamSlug")
    private String TeamSlug;
    public String getTeamSlug()
    {
        return TeamSlug;
    }
    public void setTeamSlug(String value)
    {
        TeamSlug = value;
    }

    @JsonProperty("hasWriteAccess")
    private boolean HasWriteAccess;
    public boolean getHasWriteAccess()
    {
        return HasWriteAccess;
    }
    public void setHasWriteAccess(boolean value)
    {
        HasWriteAccess = value;
    }

    @JsonProperty("thumbnail")
    private String Thumbnail;
    public String getThumbnail()
    {
        return Thumbnail;
    }
    public void setThumbnail(String value)
    {
        Thumbnail = value;
    }

    @JsonProperty("created")
    private DateTime Created = null;
    public DateTime getCreated()
    {
        return Created;
    }
    public void setCreated(DateTime value)
    {
        Created = value;
    }

    @JsonProperty("createdby")
    private DtoShortUser createdby;
    public DtoShortUser getCreatedByUser()
    {
        return createdby;
    }
    public void setCreatedByUser(DtoShortUser value)
    {
        createdby = value;
    }

    @JsonProperty("changed")
    private DateTime Changed = null;
    public DateTime getChanged()
    {
        return Changed;
    }
    public void setChanged(DateTime value)
    {
        Changed = value;
    }

    @JsonProperty("changedby")
    private DtoShortUser ChangedByUser;
    public DtoShortUser getChangedByUser()
    {
        return ChangedByUser;
    }
    public void setChangedByUser(DtoShortUser value)
    {
        ChangedByUser = value;
    }

    @JsonProperty("address")
    private String Address;
    public String getAddress()
    {
        return Address;
    }
    public void setAddress(String value)
    {
        Address = value;
    }

    @JsonProperty("modelCount")
    private int ModelCount;
    public int getModelCount()
    {
        return ModelCount;
    }
    public void setModelCount(int value)
    {
        ModelCount = value;
    }

    @JsonProperty("memberCount")
    private int MemberCount;
    public int getMemberCount()
    {
        return MemberCount;
    }
    public void setMemberCount(int value)
    {
        MemberCount = value;
    }

    @JsonProperty("topicCount")
    private int IssueCount;
    public int getIssueCount()
    {
        return IssueCount;
    }
    public void setIssueCount(int value)
    {
        IssueCount = value;
    }

    @JsonProperty("attachmentCount")
    private int AttachmentCount;
    public int getAttachmentCount()
    {
        return AttachmentCount;
    }
    public void setAttachmentCount(int value)
    {
        AttachmentCount = value;
    }

    @JsonProperty("size")
    private long Size;
    public long getSize()
    {
        return Size;
    }
    public void setSize(long value)
    {
        Size = value;
    }

    @JsonProperty("sizeMB")
    public String sizeMB;
    public String getUnitSizeMB()
    {
        // return Math.RoundString.valueOf(((double)getSize() / (1024.0 * 1024.0), 2));
        return "";
    }

    //@JsonProperty("disciplines")
    // type DtoProjectDiscipline
    @JsonIgnore
    public Iterable<String> Disciplines;
    public Iterable<String> getDisciplines()
    {
        return Disciplines;
    }
    public void setDisciplines(Iterable<String> value)
    {
        Disciplines = value;
    }

    //@JsonProperty("rights")
    // type DtoProjectDiscipline
    @JsonIgnore
    public String rights;
    public String getRights()
    {
        return rights;
    }
    public void setRights(String value)
    {
        rights = value;
    }
}
