/*
 * Copyright (c) 2016 Cornelius Preidel
 *         Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *         The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *         THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

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
