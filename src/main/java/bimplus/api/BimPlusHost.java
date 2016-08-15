/*
 * Copyright (c) 2016 Cornelius Preidel
 *         Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *         The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *         THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

/*
  Created by Cornelius on 02.08.2016.
 */
package bimplus.api;

public class BimPlusHost
{
    /**
     Base BimPlus Url.
     */
    public final String getServerName()
    {
        switch (getBimPlusEnvironment())
        {
            case Prod:
                return "https://api.bimplus.net";
            case Stage:
                return "https://api-stage.bimplus.net";
            case Dev:
                return "https://api-dev.bimplus.net";
            case LocalHost:
                return "http://localhost/bimplus.server.web";
            default:
                return "https://api.bimplus.net";
        }
    }
    public final void setServerName(String value)
    {
        if (value.contains("api-dev"))
        {
            setBimPlusEnvironment(ServerName.Dev);
        }
        else if (value.contains("api-stage"))
        {
            setBimPlusEnvironment(ServerName.Stage);
        }
        else if (value.contains("localhost"))
        {
            setBimPlusEnvironment(ServerName.LocalHost);
        }
        else
        {
            setBimPlusEnvironment(ServerName.Prod);
        }
    }

    /**
     Save the short server name.
     */
    private ServerName BimPlusEnvironment = ServerName.values()[0];
    private ServerName getBimPlusEnvironment()
    {
        return BimPlusEnvironment;
    }
    public final void setBimPlusEnvironment(ServerName value)
    {
        BimPlusEnvironment = value;
    }
}
