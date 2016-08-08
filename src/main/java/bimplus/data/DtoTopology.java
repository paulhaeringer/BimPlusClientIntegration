package bimplus.data;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * Created by Cornelius on 05.08.2016.
 */
public class DtoTopology extends BaseDto
{
    /** Parent
     */
    @JsonProperty("parent")
    private String Parent = null;
    public String getParent()
    {
        return Parent;
    }
    public void setParent(String value)
    {
        Parent = value;
    }
    /** Name
     */
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
    /** Type
     */
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
    /** Children
     */
    @JsonProperty("children")
    private List<DtoTopology> Children;
    public List<DtoTopology> getChildren()
    {
        return Children;
    }
    public void setChildren(List<DtoTopology> value)
    {
        Children = value;
    }
    /** Number
     */
    @JsonProperty("number")
    private int Number;
    public int getNumber()
    {
        return Number;
    }
    public void setNumber(int value)
    {
        Number = value;
    }
    /** tbNr
     */
    @JsonProperty("tbNr")
    private Integer TbNr = null;
    public Integer getTbNr()
    {
        return TbNr;
    }
    public void setTbNr(Integer value)
    {
        TbNr = value;
    }
    /** allplanGuid
     */
    @JsonProperty("allplanGuid")
    private String Allplan_GUID = null;
    public String getAllplan_GUID()
    {
        return Allplan_GUID;
    }
    public void setAllplan_GUID(String value)
    {
        Allplan_GUID = value;
    }


}
