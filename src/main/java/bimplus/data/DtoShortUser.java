package bimplus.data;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by Cornelius on 05.08.2016.
 */
public class DtoShortUser extends BaseDto
{
    /**
     The unique identifier of the user
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
     Email adress (username)
     */
    @JsonProperty("email")
    private String Email;
    public String getEmail()
    {
        return Email;
    }
    public void setEmail(String value)
    {
        Email = value;
    }

    /**
     Company of the user
     */
    @JsonProperty("company")
    private String Company;
    public String getCompany()
    {
        return Company;
    }
    public void setCompany(String value)
    {
        Company = value;
    }

    /**
     Fullname of the user
     */
    @JsonProperty("fullname")
    private String FullName;
    public final String getFullName()
    {
        return FullName;
    }
    public final void setFullName(String value)
    {
        FullName = value;
    }


}
