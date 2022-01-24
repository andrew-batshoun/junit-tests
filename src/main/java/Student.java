import java.util.ArrayList;


public class Student {

    private String name;
    private long id;
    private ArrayList<Integer> grades;

    public Student(String name, long id) {
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }


    public long getId() {
        return this.id;
    }


    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public Integer updateGrade(int index, int newGrade){

        return grades.set(index,newGrade);
    }

    public Integer deleteGrade(int index){

        return grades.remove(index);
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        double sum = 0;
        for(int grade: this.grades){
            sum += grade;

        }
        return sum / this.grades.size();
    }
}
