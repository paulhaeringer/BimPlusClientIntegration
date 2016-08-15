/*
 * Copyright (c) 2016 Cornelius Preidel
 *         Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *         The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *         THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package bimplus.api;

import bimplus.data.DtoTeam;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


import java.util.List;

/**
 * Created by Cornelius on 03.08.2016.
 */
public class ApiCore
{
    private static final Logger LOG = LoggerFactory.getLogger(ApiCore.class);

    public final Connection connection;
    public List<String> _exceptionList;
    public DtoTeam currentTeam;
    public final ObjectMapper mapper;
    public Boolean connected = false;

    public ApiCore(String username, String password, BimPlusHost host)
    {
        // Init Mapper
        mapper = new ObjectMapper();

        // Connection
        connection = new Connection();
        connected = connection.Connect(username, password, host);

    }

    public String GetV2TeamUrl()
    {
        return connection.host.getServerName() + "/v2/" + currentTeam.GetSlug();
    }

    public String GetV2Url()
    {
        return connection.host.getServerName() + "/v2/";
    }
}




