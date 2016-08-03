package bimplus.data;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * Created by Cornelius on 03.08.2016.
 */
public class DtoModel extends BaseDto
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
