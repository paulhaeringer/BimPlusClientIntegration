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
