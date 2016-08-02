package solibri;

import bimplus.api.BimPlusHost;
import bimplus.api.Connection;
import bimplus.api.ServerName;
import bimplus.data.DtoTeam;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * Created by Cornelius on 02.08.2016.
 */
public class ConnectionTest
{
    @Test
    public void TestStart() throws IOException {
        Connection conn = new Connection();

        BimPlusHost host = new BimPlusHost();
        host.setBimPlusEnvironment(ServerName.Dev);

        conn.Connect( "cornelius.preidel@googlemail.com", "germany" , host);

        String json = conn.sendGetRequest("https://api-dev.bimplus.net/v2/teams");

        // Mapping mechanism
        ObjectMapper mapper = new ObjectMapper();
        List<DtoTeam> myObjects = mapper.readValue(json, mapper.getTypeFactory().constructCollectionType(List.class, DtoTeam.class));

        //DtoTeam team = mapper.readValue("{\"slug\": \"Hans-Wurst\"}", DtoTeam.class);
        // List<DtoTeam> myObjects = mapper.readValue(json, new TypeReference<List<DtoTeam>>(){});
        // DtoTeam team = mapper.readValue(json, DtoTeam.class);
        // List<DtoTeam> myObjects = mapper.readValue(json, new TypeReference<List<DtoTeam>>(){});

        //JSON from String to Object
        // DtoMediumUser user = mapper.readValue(json, DtoMediumUser.class);


        // DtoMediumUser user = mapper.readValue(json, DtoMediumUser.class);

    }
}
