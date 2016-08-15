/*
 * Copyright (c) 2016 Cornelius Preidel
 *         Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *         The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *         THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package bimplus.data;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * Created by Cornelius on 03.08.2016.
 */
class DtObject
{
    /**
     Id
     */
    @JsonProperty("id")
    private String Id = "";
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
    public String Type = "";
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
    private String Elementtyp = "";
    public void setElementtyp(String value)
    {
        Elementtyp = value;
    }

    /**
     LayerId
     */
    @JsonProperty("layerid")
    private String LayerId = "";
    public String getLayerId()
    {
        return null;
        // return GetLayer();
    }

    /**
     ObjectName
     */
    @JsonProperty("ObjectName")
    private String ObjectName = "";
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
    private List<DtObject> getChildren()
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
