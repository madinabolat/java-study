package school.management;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Madina", 30, 111);
        Student student2 = new Student("Edward", 2, 112);
        Student student3 = new Student("Elsa", 8, 211);
        Student student4 = new Student("Eliz", 1, 212);

        student1.enrollCourses("Math");
        student2.enrollCourses(new String[]{"Puppy Training", "Heel Walking"});
        student3.enrollCourses(new String[]{"Fetch", "Swimming"});
        student4.enrollCourses(new String[]{"Behavior", "Fetch"});

        System.out.println(student1.getTuition());
        System.out.println(student2.getTuition());
        student1.updateTuition();
        student2.updateTuition();
        System.out.println(student1.getTuition());
        System.out.println(student2.getTuition());

        CourseManager coursemngr1 = new CourseManager();
        coursemngr1.addStudent(student1);
        coursemngr1.addStudent(student2);
        coursemngr1.addStudent(student3);
        coursemngr1.addStudent(student4);
        coursemngr1.displayAllStudents();

        student2.dropCourse("Heel Walking");
        System.out.println(student2.getTuition());

        coursemngr1.removeStudent(student1);
        coursemngr1.displayAllStudents();

        coursemngr1.addStudent(student1);
        coursemngr1.addCourseForStudent(student1,"Java");
        student1.displayDetails();


    }
}
