package bimplus.api;

import bimplus.data.DtoDivision;
import bimplus.data.DtoModel;
import bimplus.data.DtoProject;
import bimplus.data.DtoTeam;
import org.junit.Test;

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

        String model = core.DownloadDivision(division.GetId());



        // Get the IFC Project



    }
}
