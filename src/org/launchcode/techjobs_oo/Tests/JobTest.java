package org.launchcode.techjobs_oo.Tests;

import org.junit.jupiter.api.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.jupiter.api.Assertions.*;

class JobTest {

//    @org.junit.jupiter.api.BeforeEach
//    void setUp() {
//    }

    @Test
    public void testSettingJobId() {
        assertEquals(new Job().getId(), new Job().getId(), 1);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", testJob.getName());
        assertEquals("ACME", testJob.getEmployer().getValue());
        assertEquals("Desert", testJob.getLocation().getValue());
        assertEquals("Quality control", testJob.getPositionType().getValue());
        assertEquals("Persistence", testJob.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        Job testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(testJob.equals(testJob2));
    }

    @Test
    public void testToString(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String output = "\nID: 1\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence\n";

        assertEquals(output, testJob.toString());
    }

    @Test
    public void testToString2(){
        Job testJob2 = new Job();
        String output2 = "OOPS! This job does not seem to exist.";

        assertEquals(output2, testJob2.toString());
    }

    @Test
    public void testToString3(){
        Job testJob3 = new Job("Product tester", new Employer(), new Location(), new PositionType(), new CoreCompetency());
        //System.out.println(testJob3.getCoreCompetency().getValue());
        String output3 = "\nID: 1\nName: Product tester\nEmployer: Data not available\nLocation: Data not available\nPosition Type: Data not available\nCore Competency: Data not available\n";

        assertEquals(output3, testJob3.toString());
    }
}
