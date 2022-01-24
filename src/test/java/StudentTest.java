import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class StudentTest {

  @Test
  public void createObj(){
    Student Christian = new Student("Christian", 1);
    Assert.assertEquals("Christian", Christian.getName());
    Assert.assertEquals(1, Christian.getId());
    Assert.assertTrue(Christian.getGrades().isEmpty());
  }

  @Test
  public void addingGrade(){
    Student Christian = new Student("Christian", 1);
    Christian.addGrade(90);
    Christian.addGrade(95);
    Christian.addGrade(91);
    Christian.addGrade(98);
    //Assert.assertFalse(Christian.getGrades().isEmpty());
    Assert.assertSame(95, Christian.getGrades().get(1));
    Assert.assertSame(98, Christian.getGrades().get(3));
  }
  @Test
  public void averageTest(){
    Student Christian = new Student("Christian", 1);
    Christian.addGrade(90);
    Christian.addGrade(95);
    Christian.addGrade(91);
    Christian.addGrade(98);
    Assert.assertEquals(93.5, Christian.getGradeAverage(), 0);
  }


}
