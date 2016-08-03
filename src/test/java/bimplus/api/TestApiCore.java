package bimplus.api;

import bimplus.data.DtoDivision;
import bimplus.data.DtoModel;
import bimplus.data.DtoProject;
import bimplus.data.DtoTeam;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Created by Cornelius on 03.08.2016.
 */
public class TestApiCore
{
    @Test
    public void TestApiCore()
    {
        // Set the host
        BimPlusHost host = new BimPlusHost();
        host.setBimPlusEnvironment(ServerName.Dev);

        // Create the ApiCore
        ApiCore core = new ApiCore("cornelius.preidel@googlemail.com", "germany", host);
        List<DtoTeam> myTeams = core.GetTeams();

        // Set the Slug
        core.SetTeamSlug(myTeams.get(1).GetSlug());

        List<DtoProject> projects = core.GetProjects();

        List<DtoDivision> divisions = core.GetModels(projects.get(0).id);

        DtoDivision division = divisions.get(0);

        // String model = core.DownloadDivisionAsString(division.GetId());

        // Get a IFC model as Stream and read it to String
        InputStream stream = core.DownloadDivisionAsStream(division.GetId());

        BufferedReader in = new BufferedReader(
                new InputStreamReader(stream));
        String inputLine;
        StringBuffer response = new StringBuffer();

        try
        {
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
        }
        catch (IOException e )
        {

        }

        String result = response.toString();

        // Get the IFC Project



    }
}
