/*
 * Copyright (c) 2016 Cornelius Preidel
 *         Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *         The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *         THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package bimplus.api.Wrapper;

import bimplus.api.ApiCore;
import bimplus.data.DtoTopology;
import org.codehaus.jackson.JsonNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Created by Cornelius on 03.08.2016.
 */
public class Objects extends BaseWrapper
{
    private static final Logger LOG = LoggerFactory.getLogger(Objects.class);
    
    public Objects(ApiCore core)
    {
        super(core);
    }

    public DtoTopology GetObjects(String topologyId)
    {
        // try
        // {
        //     String json = core.connection.sendGetRequest( core.GetV2TeamUrl() + "/objects/" + topologyId + "/geometries/threejs");
        //     DtoTopology topology = core.mapper.readValue(json, DtoTopology.class);
        //     return topology;
        // }
        // catch(IOException e)
        // {
        //    LOG.error(e.getMessage(), e);
        // };
        // return null;
        return null;
    }

    public String GetObjectsAsExcelAttachment(String projectId, String elementTypeId)
    {
        // Get the Excel Sheet for a specific element type
        // https://api-stage.bimplus.net/v2/<team_slug>/projects/<project_id>/objects/export/excel?typeId=<elementType_guid>
        try
        {
            String json = core.connection.sendGetRequest(core.GetV2TeamUrl() + "/projects/" + projectId + "/objects/export/excel?typeId=" + elementTypeId);

            JsonNode node = core.mapper.readTree(json);
            JsonNode jsonid = node.get("attachment_id");
            return jsonid.asText();
        }
        catch(IOException e)
        {
           LOG.error(e.getMessage(), e);
        };
        return null;
    }
}
