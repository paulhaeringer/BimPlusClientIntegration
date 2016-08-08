package bimplus.data;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * Created by Cornelius on 03.08.2016.
 */
class DtoBaseIssue extends BaseDto
{
    /** ShortId
     */
    @JsonProperty("shortId")
    private int ShortId;
    public int getShortId()
    {
        return ShortId;
    }
    public void setShortId(int value)
    {
        ShortId = value;
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
    /** Status
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
    /** CreatedAt
     */
    @JsonProperty("createdAt")
    private String CreatedAt = null;
    public String getCreatedAt()
    {
        return CreatedAt;
    }
    public void setCreatedAt(String value)
    {
        CreatedAt = value;
    }
    /** ModifiedAt
     */
    @JsonProperty("modifiedAt")
    private String ModifiedAt = null;
    public String getModifiedAt()
    {
        return ModifiedAt;
    }
    public void setModifiedAt(String value)
    {
        ModifiedAt = value;
    }
    /** DueDate
     */
    @JsonProperty("dueDate")
    private String DueDate = null;
    public String getDueDate()
    {
        return DueDate;
    }
    public void setDueDate(String value)
    {
        DueDate = value;
    }
    /** Solution
     */
    @JsonProperty("solution")
    private String Solution;
    public String getSolution()
    {
        return Solution;
    }
    public void setSolution(String value)
    {
        Solution = value;
    }
    /** Type
     */
    // @JsonProperty("type")
    // Type IssueType
    @JsonIgnore
    public String Type;
    public String getType()
    {
        return Type;
    }
    public void setType(String value)
    {
        Type = value;
    }
    /** Classification
     */
    @JsonProperty("classification")
    private String Classification;
    public String getClassification()
    {
        return Classification;
    }
    public void setClassification(String value)
    {
        Classification = value;
    }
    /** Priority
     */
    @JsonProperty("priority")
    private String Priority;
    public String getPriority()
    {
        return Priority;
    }
    public void setPriority(String value)
    {
        Priority = value;
    }
    /** Revision
     */
    @JsonProperty("revision")
    private Integer Revision = null;
    public Integer getRevision()
    {
        return Revision;
    }
    public void setRevision(Integer value)
    {
        Revision = value;
    }
    /** CcUsers
     */
    @JsonProperty("cc")
    private List<String> CcUsers;
    public List<String> getCcUsers()
    {
        return CcUsers;
    }
    public void setCcUsers(List<String> value)
    {
        CcUsers = value;
    }
    /** ClashId
     */
    @JsonProperty("clashId")
    private String ClashId = null;
    public String getClashId()
    {
        return ClashId;
    }
    public void setClashId(String value)
    {
        ClashId = value;
    }
    /** Id of issue/topic in external bcf server
     */
    // @JsonProperty("shortId")
    private String ExternalIssueId;
    public String getExternalIssueId()
    {
        return ExternalIssueId;
    }
    public void setExternalIssueId(String value)
    {
        ExternalIssueId = value;
    }

}
