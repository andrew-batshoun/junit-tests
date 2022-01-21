import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Cohort {

    private List<Student> students;

    public Cohort() {
        this.students = new ArrayList<>();
    }

    public double getCohortAverage() {
        double avg = 0;
        for (Student student : this.getStudents()) {
            avg += student.getGradeAverage();
        }
        return avg / this.getStudents().size();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public String findStudentById(long id) {
        String studentById = null;
        for (Student student : students) {
            if (student.getId() == id) {
                studentById = student.getName();
            }
        }
        return studentById;
    }

    //testing bonus
    public static void main(String[] args) {

        Cohort cohortWithMany = new Cohort();

        Student Michael = new Student(1, "Michael");
        Michael.addGrade(94);
        Michael.addGrade(90);
        Michael.addGrade(98);

        Student Morgan = new Student(2, "Morgan");
        Morgan.addGrade(96);
        Morgan.addGrade(90);
        Morgan.addGrade(93);

        cohortWithMany.addStudent(Michael);
        cohortWithMany.addStudent(Morgan);

        System.out.println(cohortWithMany.findStudentById(2));
    }


}