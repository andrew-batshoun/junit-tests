import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CohortTest {
    Cohort emptyCohort;
    Cohort cohortWithOne;
    Cohort cohortWithMany;

    @Before
    public void setUp(){
    emptyCohort = new Cohort();

    cohortWithOne = new Cohort();
    Student Michael = new Student(1, "Michael");
    Michael.addGrade(94);
    Michael.addGrade(90);
    Michael.addGrade(98);
    cohortWithOne.addStudent(Michael);

    cohortWithMany = new Cohort();
    Student Morgan = new Student(2, "Morgan");
    Morgan.addGrade(96);
    Morgan.addGrade(90);
    Morgan.addGrade(93);

    cohortWithMany.addStudent(Michael);
    cohortWithMany.addStudent(Morgan);
    }
    @Test
    public void addStudents(){
        Assert.assertEquals("Michael", cohortWithOne.getStudents().get(0).getName());
        Assert.assertEquals("Morgan", cohortWithMany.getStudents().get(1).getName());

    }
    @Test
    public void getStudents(){
        Assert.assertEquals(1, cohortWithOne.getStudents().size());
        Assert.assertEquals(2, cohortWithMany.getStudents().size());
    }
    @Test
    public void averageGrade(){
        Assert.assertEquals(93.5, cohortWithMany.getCohortAverage(),0);
    }
    @Test
    public void nameById(){
        Assert.assertEquals("Morgan", cohortWithMany.findStudentById(2));
    }


}
