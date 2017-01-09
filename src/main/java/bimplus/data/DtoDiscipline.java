/*
 * Copyright (c) 2016 Cornelius Preidel
 *         Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *         The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *         THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package bimplus.data;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by Cornelius on 03.08.2016.
 */
class DtoDiscipline extends BaseDto
{
    /**
     category
     */
    @JsonProperty("category")
    private String Category = "";
    public final String getCategory()
    {
        return Category;
    }
    public final void setCategory(String value)
    {
        Category = value;
    }

    /**
     Name
     */
    @JsonProperty("name")
    private String Name = null;
    public final String getName(){return Name; }
    public final void setName(String value)
    {
        Name = value;
    }

    /**
     Name
     */
    @JsonProperty("ifcType")
    private String ifcType = null;
    public final String getifcType(){return ifcType; }
    public final void setifcType(String value) { ifcType = value; }

}
