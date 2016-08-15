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
class DtoModel extends BaseDto
{
    /** ElementCount
     */
    @JsonProperty("elementsCount")
    private int ElementCount;
    public final int getElementCount()
    {
        return ElementCount;
    }
    public final void setElementCount(int value)
    {
        ElementCount = value;
    }

    /** FaceCount
     */
    @JsonProperty("faceCount")
    private int FaceCount;
    public final int getFaceCount()
    {
        return FaceCount;
    }
    public final void setFaceCount(int value)
    {
        FaceCount = value;
    }

    /** VerticesCount
     */
    @JsonProperty("verticesCount")
    private int VerticesCount;
    public final int getVerticesCount()
    {
        return VerticesCount;
    }
    public final void setVerticesCount(int value)
    {
        VerticesCount = value;
    }

    /** Viewbox
     */
    // Type ThreeJsViewBox
    // @JsonProperty("viewbox")
    @JsonIgnore
    public String Viewbox;
    public final String getViewbox()
    {
        return Viewbox;
    }
    public final void setViewbox(String value)
    {
        Viewbox = value;
    }

    /** Colors
     */
    @JsonProperty("colors")
    private List<Integer> Colors;
    public final List<Integer> getColors()
    {
        return Colors;
    }
    public final void setColors(List<Integer> value)
    {
        Colors = value;
    }

    /** Objects
     */
    // Type DtObject
    // @JsonProperty("objects")
    @JsonIgnore
    public List<String> Objects;
    public final List<String> getObjects()
    {
        return Objects;
    }
    public final void setObjects(List<String> value)
    {
        Objects = value;
    }

}
