package bimplus.data;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

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

    //@JsonProperty("created")
    // java.time.LocalDateTime
    @JsonIgnore
    private String Created = null;
    public String getCreated()
    {
        return Created;
    }
    public void setCreated(String value)
    {
        Created = value;
    }

    //@JsonProperty("createdby")
    // type DtoShortUser
    @JsonIgnore
    public String createdby;
    // public String getCreatedByUser()
    // {
    //     return createdby;
    // }
    // public void setCreatedByUser(String value)
    // {
    //     createdby = value;
    // }

    //@JsonProperty("changed")
    // type DateTime
    @JsonIgnore
    private String Changed = null;
    public String getChanged()
    {
        return Changed;
    }
    public void setChanged(String value)
    {
        Changed = value;
    }

    //@JsonProperty("changedby")
    // type DtoShortUser
    @JsonIgnore
    public String changedby;
    // public String getChangedByUser()
    // {
    //     return ChangedByUser;
    // }
    // public void setChangedByUser(String value)
    // {
    //     ChangedByUser = value;
    // }

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
    private Iterable<String> Disciplines;
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
