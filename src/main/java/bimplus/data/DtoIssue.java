/*
 * Copyright (c) 2016 Cornelius Preidel
 *         Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *         The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *         THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

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
