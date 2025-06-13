package school.management;

import school.Person;

import java.util.ArrayList;

public class Student extends Person {
    private int studentID;
    private ArrayList<String> enrolledCourses;
    private double tuition;

    public Student(String name, int age, int studentID) {
        super(name,age);
        this.studentID = studentID;
        this.enrolledCourses = new ArrayList<>();
    }

    public double getTuition() {
        return tuition;
    }

    public void updateTuition() {
        this.tuition = 500 * enrolledCourses.size();
    }

    protected void dropCourse(String course){
        enrolledCourses.remove(course);
        updateTuition();
    }

    protected void enrollCourses(String[] courses){
        for (int i = 0; i<courses.length; i++){
            enrolledCourses.add(courses[i]);
        }
    }

    protected void enrollCourses(String course){
        enrolledCourses.add(course);
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Courses: ");
        for (int i = 0; i<enrolledCourses.size(); i++){
            System.out.println(enrolledCourses.get(i));
        }
    }

}
