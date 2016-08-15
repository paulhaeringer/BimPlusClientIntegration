package bimplus.api;

import bimplus.api.Wrapper.*;
import bimplus.data.*;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cornelius on 03.08.2016.
 */
public class TestApiCore
{

    @Test
    public void TestApiCore()
    {
        // ----- CONNECT TO BIM+ -----
        BimPlusHost host = new BimPlusHost();
        host.setBimPlusEnvironment(ServerName.Dev);
        ApiCore core = new ApiCore("cornelius.preidel@googlemail.com", "germany", host);
        if(core.connected == false)
            return;

        // ----- TEAMS -----
        Teams teamsAPI = new Teams(core);
        List<DtoTeam> myTeams = teamsAPI.GetTeams();
        // Set a first Team for the slug
        core.currentTeam = myTeams.get(1);

        // ----- PROJECTS -----
        Projects projectAPI = new Projects(core);
        List<DtoProject> projects = projectAPI.GetProjects();

        // Create a new project
        DtoProject project = new DtoProject();
        project.setName("TESTPROJECT");
        projectAPI.CreateNewProject(project);

        // Update projects
        projects = projectAPI.GetProjects();

        // Delete the Project
        for (DtoProject iterator: projects)
        {
            if(iterator.getName().equals("TESTPROJECT"))
                projectAPI.DeleteProject(iterator.GetId());
        }

        // ----- TOPOLOGY -----
        DtoTopology topo = projectAPI.GetProjectTopology(projects.get(0).GetId());

        // ----- DIVISIONS -----
        Divisions divisionAPI = new Divisions(core);
        List<DtoDivision> divisions = divisionAPI.GetDivisions(projects.get(0).GetId());

        DtoDivision newDivision = new DtoDivision();
        newDivision.setName("TESTMODEL");
        divisionAPI.CreateNewDivision(projects.get(0).id, newDivision);

        divisions = divisionAPI.GetDivisions(projects.get(0).GetId());

        for (DtoDivision iterator: divisions)
        {
            if(iterator.getName().equals("TESTMODEL"))
                divisionAPI.DeleteDivision(iterator.GetId());
        }

        // IFC Models/Divisions
        List<DtoDivision> ifcProjects = new ArrayList<>();
        for (DtoDivision item : divisions)
        {
            // Create IFC4 File of the division
            // divisionAPI.ExportModelAsIFC(item.getProjectId(), item.id);

            if (item.getInputType().equals("IFC_IMPORT"))
            {
                ifcProjects.add(item);
            }
        }
        // Download IFC files
        // as string
            //String ifcFile = divisionAPI.DownloadDivisionAsString(divisions.get(0).GetId());
        // as stream
            //InputStream ifcStream = divisionAPI.DownloadDivisionAsStream(divisions.get(0).GetId());
            //BufferedReader in = new BufferedReader(new InputStreamReader(ifcStream));
            //String inputLine;
            //StringBuffer response = new StringBuffer();
            //try
            //{
            //    while ((inputLine = in.readLine()) != null)
            //    {
            //        response.append(inputLine);
            //    }
            //    in.close();
            //}
            //catch (IOException e )
            //{
            //}
            //String result = response.toString();

        // ----- OBJECTS -----
        // Objects objectApi = new Objects(core);
        // if(divisions.get(0) != null)
        // {
        //     DtoTopology topology = objectApi.GetObjects(divisions.get(0).getTopologyDivisionId());
        // }

        // PutDivision - e.g. for a new version of the division
        // DtoDivision division = divisions.get(0);
        // division.setName(division.getName() + "_newVersionBySMC");
        // divisionAPI.PutDivision(division.GetId(), division);

        // ----- ISSUES -----
        Issues issueAPI = new Issues(core);
        List<DtoIssue> issues = issueAPI.GetIssues(projects.get(0).id);

        DtoIssue newIssue = new DtoIssue();
        newIssue.setName("TESTISSUE");
        issueAPI.CreateIssue(projects.get(0).id, newIssue);

        issues = issueAPI.GetIssues(projects.get(0).id);

        for (DtoIssue iterator: issues)
        {
            if(iterator.getName().equals("TESTISSUE"))
                issueAPI.DeleteIssue(iterator.GetId());
        }

        // ----- PINS -----
        Pins pinApi = new Pins(core);
        if(issues.get(0) != null)
        {
            List<DtoPin> pins = pinApi.GetPins(issues.get(0).GetId());
        }

        // ----- ATTACHMENTS -----
        Attachments attachmentAPI = new Attachments(core);
        List<DtoAttachment> attachments = attachmentAPI.GetAttachments(projects.get(0).id);
    }
}
