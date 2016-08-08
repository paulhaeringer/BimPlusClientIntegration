package bimplus.data;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.joda.time.DateTime;

/**
 * Created by Cornelius on 03.08.2016.
 */
public class DtoDivision extends BaseDto
{
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
    /** Description
     */
    @JsonProperty("description")
    private String Description;
    public String getDescription()
    {
        return Description;
    }
    public void setDescription(String value)
    {
        Description = value;
    }
    /** ProjectId
     */
    @JsonProperty("projectId")
    private String ProjectId = "";
    public String getProjectId()
    {
        return ProjectId;
    }
    public void setProjectId(String value)
    {
        ProjectId = value;
    }
    /** TopologyDivisionId
     */
    @JsonProperty("topologyId")
    private String TopologyDivisionId = null;
    public String getTopologyDivisionId()
    {
        return TopologyDivisionId;
    }
    public void setTopologyDivisionId(String value)
    {
        TopologyDivisionId = value;
    }
    /** Revisions
     */
    // Type DtoRevision
    // @JsonProperty("revisionObjects")
    @JsonIgnore
    public Iterable<String> revisionObjects;
    public Iterable<String> getRevisions()
    {
        return revisionObjects;
    }
    public void setRevisions(Iterable<String> value)
    {
        revisionObjects = value;
    }
    /** Disciplines
     */
    @JsonProperty("disciplines")
    private Iterable<String> Disciplines;
    public Iterable<String> getDisciplines()
    {
        return Disciplines;
    }
    public void setDisciplines(Iterable<String> value)
    {
        Disciplines = value;
    }
    /** TeamSlug
     */
    @JsonProperty("teamSlug")
    private String TeamSlug;
    public String getTeamSlug()
    {
        return TeamSlug;
    }
    public void setTeamSlug(String value)
    {
        TeamSlug = value;
    }
    /** Url
     */
    @JsonProperty("url")
    private String Url;
    public String getUrl()
    {
        return Url;
    }
    public void setUrl(String value)
    {
        Url = value;
    }
    /** Application
     */
    @JsonProperty("fileType")
    private String Application;
    public String getApplication()
    {
        return Application;
    }
    public void setApplication(String value)
    {
        Application = value;
    }
    /** InputType
     */
    @JsonProperty("inputType")
    private String InputType;
    public String getInputType()
    {
        return InputType;
    }
    public void setInputType(String value)
    {
        InputType = value;
    }
    /** Time of creation
     */
    @JsonProperty("created")
    private DateTime Created = null;
    public DateTime getCreated()
    {
        return Created;
    }
    public void setCreated(DateTime value)
    {
        Created = value;
    }
    /** User which created
     */
    // Type DtoShortUser
    // @JsonProperty("createdby")
    @JsonIgnore
    public String createdby;
    public String createdby()
    {
        return createdby;
    }
    public void setCreatedByUser(String value)
    {
        createdby = value;
    }
    /** Time of last modification
     */
    @JsonProperty("changed")
    private DateTime Changed = null;
    public DateTime getChanged()
    {
        return Changed;
    }
    public void setChanged(DateTime value)
    {
        Changed = value;
    }
    /** Last time modified by user
     */
    // Type DtoShortUser
    // @JsonProperty("changedby")
    @JsonIgnore
    public String changedby;
    public String getChangedByUser()
    {
        return changedby;
    }
    public void setChangedByUser(String value)
    {
        changedby = value;
    }
    /** Size
     */
    @JsonProperty("size")
    private long Size;
    public long getSize()
    {
        return Size;
    }
    public void setSize(long value)
    {
        Size = value;
    }
    /** Size in MB
     */
    @JsonProperty("sizeMB")
    public String sizeMB;
    public String getUnitSizeMB()
    {
        return "";
    }
    /** Name of file, from which this model was imported
     */
    @JsonProperty("importFileName")
    private String ImportFileName;
    public String getImportFileName()
    {
        return ImportFileName;
    }
    public void setImportFileName(String value)
    {
        ImportFileName = value;
    }

    /** Size of file, from which this model was imported
     */
    @JsonProperty("importFileSize")
    private long ImportFileSize;
    public long getImportFileSize()
    {
        return ImportFileSize;
    }
    public void setImportFileSize(long value)
    {
        ImportFileSize = value;
    }

    /** Status of model ( pending, processing, done, ... )
     */
    @JsonProperty("status")
    private String Status;
    public String getStatus()
    {
        return Status;
    }
    public void setStatus(String value)
    {
        Status = value;
    }

    /** IfcProjectId, if it's available
     */
    @JsonProperty("ifcProject")
    private String IfcProject;
    public String getIfcProject()
    {
        return IfcProject;
    }
    public void setIfcProject(String value)
    {
        IfcProject = value;
    }
}
