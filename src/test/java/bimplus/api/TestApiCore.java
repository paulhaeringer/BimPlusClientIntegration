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
        // Set the host
        BimPlusHost host = new BimPlusHost();
        host.setBimPlusEnvironment(ServerName.Dev);

        // Create the ApiCore
        ApiCore core = new ApiCore("cornelius.preidel@googlemail.com", "germany", host);

        if(core.connected == false)
            return;

        // TEAMS
        Teams teamsAPI = new Teams(core);
        List<DtoTeam> myTeams = teamsAPI.GetTeams();
        // Set a first TeamSlug
        core.SetTeamSlug(myTeams.get(1).GetSlug());

        // PROJECTS
        Projects projectAPI = new Projects(core);
        List<DtoProject> projects = projectAPI.GetProjects();

        // Create a new project
        // DtoProject project = new DtoProject();
        // project.setName("TestMe!");
        // projectAPI.CreateNewProject(project);

        // DIVISIONS
        Divisions divisionAPI = new Divisions(core);
        List<DtoDivision> divisions = divisionAPI.GetDivisions(projects.get(0).GetId());

        // PutDivision - e.g. for a new version of the division
        // DtoDivision division = divisions.get(0);
        // division.setName(division.getName() + "_newVersionBySMC");
        // divisionAPI.PutDivision(division.GetId(), division);

        // Get the IFC Projects ...
        List<DtoDivision> ifcProjects = new ArrayList<DtoDivision>();
        for (DtoDivision item : divisions)
        {
            if (item.getInputType().equals("IFC_IMPORT"))
            {
                ifcProjects.add(item);
            }
        }


        // DOWNLOAD IFC FILES
        // as STRING
        String ifcFile = divisionAPI.DownloadDivisionAsString(divisions.get(0).GetId());
        // as STREAM
        InputStream ifcStream = divisionAPI.DownloadDivisionAsStream(divisions.get(0).GetId());
        BufferedReader in = new BufferedReader(new InputStreamReader(ifcStream));
        String inputLine;
        StringBuffer response = new StringBuffer();
        try
        {
            while ((inputLine = in.readLine()) != null)
            {
                response.append(inputLine);
            }
            in.close();
        }
        catch (IOException e )
        {

        }
        String result = response.toString();


        // ISSUES
        Issues issueAPI = new Issues(core);
        List<DtoIssue> issues = issueAPI.GetIssues(projects.get(0).id);

        // Create an Issue
        DtoIssue issue = new DtoIssue();
        issue.setName("This is my Test Issue! jdahesaoiesahrleshrl");
        issueAPI.CreateIssue(projects.get(0).id, issue);

        // ATTACHMENTS
        Attachments attachmentAPI = new Attachments(core);
        attachmentAPI.GetAttachments(projects.get(0).id);


    }
}
