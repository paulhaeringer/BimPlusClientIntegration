package bimplus.data;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Cornelius on 03.08.2016.
 */
public class DtoAttachment extends BaseDto
{

    //C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty("objectIds")] public virtual IEnumerable<Guid> ObjectIds
    @JsonProperty("objectIds")
    private List<String> ObjectIds;
    public List<String> getObjectIds()
    {
        return new ArrayList<>(Arrays.asList(new String[]{getRelatedId()}));
    }

    @JsonProperty("Name")
    private String Name;
    public String getName()
    {
        return Name;
    }
    public void setName(String value)
    {
        Name = value;
    }

    @JsonProperty("fileName")
    private String FileName;
    public String getFileName()
    {
        return FileName;
    }
    public void setFileName(String value)
    {
        FileName = value;
    }

    @JsonProperty("type")
    private String Type;
    public String getType()
    {
        return Type;
    }
    public void setType(String value)
    {
        Type = value;
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

    @JsonProperty("createdAt")
    private DateTime CreatedAt = null;
    public DateTime getCreatedAt()
    {
        return CreatedAt;
    }
    public void setCreatedAt(DateTime value)
    {
        CreatedAt = value;
    }

    //C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty("creator")] public virtual DtoMediumUser Creator {get;set;}
    // @JsonProperty("creator")
    // Type DtoMediumUser
    @JsonIgnore
    public String creator;
    public String getCreator()
    {
        return creator;
    }
    public void setCreator(String value)
    {
        creator = value;
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

    // @JsonProperty("changedBy")
    // Type DtoShortUser
    @JsonIgnore
    public String changedBy;
    public String getChangedBy()
    {
        return changedBy;
    }
    public void setChangedBy(String value)
    {
        changedBy = value;
    }

    @JsonProperty("hash")
    private String Hash;
    public String getHash()
    {
        return Hash;
    }
    public void setHash(String value)
    {
        Hash = value;
    }

    // @JsonProperty("attachmentType")
    // Type AttachmentType
    // @JsonIgnore
    @JsonProperty("attachmentType")
    private String attachmentType = null;
    public String getAttachmentType()
    {
        return attachmentType;
    }
    public void setAttachmentType(String value)
    {
        attachmentType = value;
    }

    @JsonProperty("classification")
    private String Classification;
    public String getClassification()
    {
        return Classification;
    }
    public void setClassification(String value)
    {
        Classification = value;
    }

    @JsonProperty("tag")
    private String Tag;
    public String getTag()
    {
        return Tag;
    }
    public void setTag(String value)
    {
        Tag = value;
    }

    @JsonProperty("sizeMB")
    public String sizeMB;
    public String getSizeInMB()
    {
        // return Math.RoundString.valueOf(((double)getSize() / (1024.0 * 1024.0),2))
        return "";
    }

    @JsonProperty("version")
    private int DocumentVersion;
    public int getDocumentVersion()
    {
        return DocumentVersion;
    }
    public void setDocumentVersion(int value)
    {
        DocumentVersion = value;
    }

    @JsonProperty("StorageKey")
    private String StorageKey;
    public String getStorageKey()
    {
        return StorageKey;
    }
    public void setStorageKey(String value)
    {
        StorageKey = value;
    }

    @JsonProperty("relatedId")
    private String RelatedId = "";
    private String getRelatedId()
    {
        return RelatedId;
    }
    public final void setRelatedId(String value)
    {
        RelatedId = value;
    }

    @JsonProperty("userRoleId")
    private String UserRoleId = null;
    public final String getUserRoleId()
    {
        return UserRoleId;
    }
    public final void setUserRoleId(String value)
    {
        UserRoleId = value;
    }

    // @JsonProperty("rights")
    // Type DtoDocumentUserRights
    @JsonIgnore
    public String rights;
    public final String getRights()
    {
        return rights;
    }
    public final void setRights(String value)
    {
        rights = value;
    }

}
