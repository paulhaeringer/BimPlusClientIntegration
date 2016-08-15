/*
 * Copyright (c) 2016 Cornelius Preidel
 *         Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *         The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *         THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

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
