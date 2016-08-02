package bimplus.data;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by Cornelius on 02.08.2016.
 */
public class DtoTeam
{
    public String slug;
    public String id;
    public String name;
    public String displayname;
    public String owner;

    @JsonProperty("slug")
    public String GetSlug() { return slug; }

    @JsonProperty("id")
    public String GetId() { return id; }

    @JsonProperty("name")
    public String GetName() { return name; }

    @JsonProperty("displayname")
    public String GetDisplayName() { return displayname; }

    @JsonProperty("owner")
    public String GetOwner() { return owner; }

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
