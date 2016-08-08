package bimplus.data;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by Cornelius on 03.08.2016.
 */
public abstract class BaseDto
{
    public final String id = null;
    @JsonProperty("id")
    public String GetId() { return id; }
}
