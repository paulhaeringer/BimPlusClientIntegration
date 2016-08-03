package bimplus.data;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by Cornelius on 03.08.2016.
 */
public class DtoIssue extends DtoBaseIssue
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
    /** Author
     */
    // @JsonProperty("author")
    // Type DtoMediumUser
    @JsonIgnore
    public String author;
    public String getAuthor()
    {
        return author;
    }
    public void setAuthor(String value)
    {
        author = value;
    }
    /** Responsible
     */

    // @JsonProperty("responsible")
    // Type DtoMediumUser
    @JsonIgnore
    public String responsible;
    public String getResponsible()
    {
        return responsible;
    }
    public void setResponsible(String value)
    {
        responsible = value;
    }
    /** Scene
     */
    @JsonProperty("scene")
    private String Scene;
    public String getScene()
    {
        return Scene;
    }
    public void setScene(String value)
    {
        Scene = value;
    }
    /** AttachmentsCount
     */
    @JsonProperty("attachmentsCount")
    private int AttachmentsCount;
    public int getAttachmentsCount()
    {
        return AttachmentsCount;
    }
    public void setAttachmentsCount(int value)
    {
        AttachmentsCount = value;
    }
    /** PinsCount
     */
    @JsonProperty("pinsCount")
    private int PinsCount;
    public int getPinsCount()
    {
        return PinsCount;
    }
    public void setPinsCount(int value)
    {
        PinsCount = value;
    }
    /** CommentsCount
     */
    @JsonProperty("commentsCount")
    private int CommentsCount;
    public int getCommentsCount()
    {
        return CommentsCount;
    }
    public void setCommentsCount(int value)
    {
        CommentsCount = value;
    }
    /** HyperlinksCount
     */
    @JsonProperty("hyperlinksCount")
    private int HyperlinksCount;
    public int getHyperlinksCount()
    {
        return HyperlinksCount;
    }
    public void setHyperlinksCount(int value)
    {
        HyperlinksCount = value;
    }
}
