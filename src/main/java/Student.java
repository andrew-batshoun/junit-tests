import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    public Scanner scan = new Scanner(System.in);
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

    public Integer updateGrade(){
        System.out.println("Which grade would you like to replace?");
        int oldGrade = scan.nextInt();
        System.out.println("What is the new grade?");
        int newGrade = scan.nextInt();
        return grades.set(oldGrade,newGrade);
    }

    public Integer deleteGrade(){
        System.out.println("Which grade would you like to delete?");
        int delGrade = scan.nextInt();
        return grades.remove(delGrade);
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
