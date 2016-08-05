package bimplus.data;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by Cornelius on 05.08.2016.
 */
public class DtoPosition extends BaseDto
{
    /** X
     */
    @JsonProperty("x")
    private float X;
    public final float getX()
    {
        return X;
    }
    public final void setX(float value)
    {
        X = value;
    }

    /** Y
     */
    @JsonProperty("y")
    private float Y;
    public final float getY()
    {
        return Y;
    }
    public final void setY(float value)
    {
        Y = value;
    }

    /** Z
     */
    @JsonProperty("z")
    private float Z;
    public final float getZ()
    {
        return Z;
    }
    public final void setZ(float value)
    {
        Z = value;
    }

}
