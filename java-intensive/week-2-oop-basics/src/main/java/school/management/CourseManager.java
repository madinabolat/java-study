package school.management;

import java.util.ArrayList;

public class CourseManager {
    private ArrayList<Student> students;

    public CourseManager(){
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    protected void addCourseForStudent(Student student, String course){
        student.enrollCourses(course);
    }
    protected void removeCourseForStudent(Student student, String course){
        student.dropCourse(course);
    }

    protected void removeStudent(Student student){
        students.remove(student);
    }


    public void displayAllStudents(){
        for (int i = 0; i<students.size(); i++){
            System.out.println(students.get(i).name);
        }

    }

}
