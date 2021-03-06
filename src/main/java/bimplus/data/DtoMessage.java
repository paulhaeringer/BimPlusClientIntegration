/*
 * Copyright (c) 2016 Cornelius Preidel
 *         Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *         The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *         THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package bimplus.data;

import org.codehaus.jackson.annotate.JsonProperty;
import org.joda.time.DateTime;

/**
 * Created by Cornelius on 05.08.2016.
 */
public class DtoMessage
{
    /**
     Unique ID of the message
     */
    @JsonProperty("id")
    private String Id = "";
    public String getId()
    {
        return Id;
    }
    public void setId(String value)
    {
        Id = value;
    }

    /**
     The target user id
     */
    @JsonProperty("userId")
    private String UserId = "";
    public String getUserId()
    {
        return UserId;
    }
    public void setUserId(String value)
    {
        UserId = value;
    }

    /**
     Receiver of the message
     */
    @JsonProperty("receiver")
    private DtoShortUser Receiver;
    public DtoShortUser getReceiver()
    {
        return Receiver;
    }
    public void setReceiver(DtoShortUser value)
    {
        Receiver = value;
    }

    /**
     Sender of the message
     */
    @JsonProperty("sender")
    private DtoShortUser Sender;
    public DtoShortUser getSender()
    {
        return Sender;
    }
    public void setSender(DtoShortUser value)
    {
        Sender = value;
    }

    /**
     Denotes a specific source, i.ex. 'ImportService'
     */@JsonProperty("source")
    private String Source;
    public String getSource()
    {
        return Source;
    }
    public void setSource(String value)
    {
        Source = value;
    }

    /**
     Topic
     */
    @JsonProperty("topic")
    private String Topic;
    public String getTopic()
    {
        return Topic;
    }
    public void setTopic(String value)
    {
        Topic = value;
    }

    /** Severity
     */@JsonProperty("severity")
    private String Severity;
    public String getSeverity()
    {
        return Severity;
    }
    public void setSeverity(String value)
    {
        Severity = value;
    }

    /** ReturnCode
     */
    @JsonProperty("returnCode")
    private String ReturnCode;
    public String getReturnCode()
    {
        return ReturnCode;
    }
    public void setReturnCode(String value)
    {
        ReturnCode = value;
    }

    /** Timestamp
     */@JsonProperty("timestamp")
    private DateTime Timestamp = DateTime.now();
    public DateTime getTimestamp()
    {
        return Timestamp;
    }
    public void setTimestamp(DateTime value)
    {
        Timestamp = value;
    }

    /** Unread
     */
    @JsonProperty("unread")
    private boolean Unread;
    public boolean getUnread()
    {
        return Unread;
    }
    public void setUnread(boolean value)
    {
        Unread = value;
    }

    /** UnreadEmail
     */
    @JsonProperty("unreadEmail")
    private boolean UnreadEmail;
    public boolean getUnreadEmail()
    {
        return UnreadEmail;
    }
    public void setUnreadEmail(boolean value)
    {
        UnreadEmail = value;
    }

    /** UnreadBrowserNotification
     */
    @JsonProperty("unreadBrowserNotification")
    private boolean UnreadBrowserNotification;
    public boolean getUnreadBrowserNotification()
    {
        return UnreadBrowserNotification;
    }
    public void setUnreadBrowserNotification(boolean value)
    {
        UnreadBrowserNotification = value;
    }

    /** UnreadDesktopNotification
     */
    @JsonProperty("unreadDesktopNotification")
    private boolean UnreadDesktopNotification;
    public boolean getUnreadDesktopNotification()
    {
        return UnreadDesktopNotification;
    }
    public void setUnreadDesktopNotification(boolean value)
    {
        UnreadDesktopNotification = value;
    }

    /** AdditionalData
     */
    @JsonProperty("additionalData")
    private String AdditionalData;
    public String getAdditionalData()
    {
        return AdditionalData;
    }
    public void setAdditionalData(String value)
    {
        AdditionalData = value;
    }

    /** CorrelationId
     */
    @JsonProperty("correlationId")
    private String CorrelationId = null;
    public String getCorrelationId()
    {
        return CorrelationId;
    }
    public void setCorrelationId(String value)
    {
        CorrelationId = value;
    }

}
