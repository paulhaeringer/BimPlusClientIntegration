package bimplus.data;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * Created by Cornelius on 03.08.2016.
 */
public class DtObject
{
    /**
     Id
     */
    @JsonProperty("id")
    private String Id = new String();
    public final String getId()
    {
        return Id;
    }
    public final void setId(String value)
    {
        Id = value;
    }

    /**
     Parent
     */
    @JsonProperty("parent")
    private String Parent = null;
    public final String getParent()
    {
        return Parent;
    }
    public final void setParent(String value)
    {
        Parent = value;
    }

    /**
     Type
     */
    @JsonProperty("type")
    public String Type = new String();
    public String getType()
    {
        return this.getClass().getName();
    }

    /**
     Elementtyp
     */
    //[JsonIgnore]
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty("elementtyp", NullValueHandling = NullValueHandling.Ignore)] public virtual Guid Elementtyp {get;set;}
    @JsonProperty("elementtyp")
    public String Elementtyp = new String();
    public void setElementtyp(String value)
    {
        Elementtyp = value;
    }

    /**
     LayerId
     */
    @JsonProperty("layerid")
    private String LayerId = new String();
    public String getLayerId()
    {
        return null;
        // return GetLayer();
    }

    /**
     ObjectName
     */
    @JsonProperty("ObjectName")
    private String ObjectName = new String();
    // public abstract String getObjectName();
    /**
     IsParent
     */
    @JsonProperty("IsParent")
    private boolean IsParent;
    public boolean getIsParent()
    {
        return getChildren() != null;
    }

    /**
     AttributeGroups
     */
    // @JsonProperty("attributes")
    // Type Map<String, DtoAttributesGroup>
    @JsonIgnore
    public String AttributeGroups;
    public final String getAttributeGroups()
    {
        return AttributeGroups;
    }
    public final void setAttributeGroups(String value)
    {
        AttributeGroups = value;
    }

    /**
     Children
     */
    @JsonProperty("children")
    private List<DtObject> Children;
    public final List<DtObject> getChildren()
    {
        return Children;
    }
    public final void setChildren(List<DtObject> value)
    {
        Children = value;
    }

    /**
     Property with additional free attribute ID
     */
    @JsonProperty("WithFreeAttrId")
    private boolean WithFreeAttrId;
    public boolean getWithFreeAttrId()
    {
        return WithFreeAttrId;
    }
    public void setWithFreeAttrId(boolean value)
    {
        WithFreeAttrId = value;
    }

    /**
     Public "Name" property returned in json
     */
    @JsonProperty("name")
    private String DisplayName;
    public String getDisplayName()
    {
        return DisplayName;
    }
    public void setDisplayName(String value)
    {
        DisplayName = value;
    }

    /**
     ChunkSize for paging
     */
    @JsonProperty("chunksize")
    private Long ChunkSize = null;
    public Long getChunkSize()
    {
        return ChunkSize;
    }
    public void setChunkSize(Long value)
    {
        ChunkSize = value;
    }
}
