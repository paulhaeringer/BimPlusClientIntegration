package bimplus.data;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by Cornelius on 02.08.2016.
 */
public class DtoTeam extends BaseDto
{
    @JsonProperty("slug")
    public String slug = null;
    public String GetSlug() {
        return slug;
    }

    @JsonProperty("name")
    private String name = null;
    public String GetName() {
        return name;
    }

    @JsonProperty("displayname")
    private String displayname = null;
    public String GetDisplayName() {
        return displayname;
    }

    @JsonProperty("owner")
    private String owner = null;
    public String GetOwner() {
        return owner;
    }

    @JsonIgnore
    public String ownerobject;
    @JsonIgnore
    public double totalstorage;
    @JsonIgnore
    public double storagestats;
    @JsonIgnore
    public double status;
    @JsonIgnore
    public double teamWorksConnection;
    @JsonIgnore
    public double dataStorageStatus;
    @JsonIgnore
    public double ismyteam;
    @JsonIgnore
    public double rights;
    @JsonIgnore
    public double publicread;
    @JsonIgnore
    public double publicwrite;
    @JsonIgnore
    public double accountType;
}
