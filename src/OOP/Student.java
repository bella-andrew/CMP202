package OOP;

public class Student extends User {
    String matric_no = "bhu/22/04/05/0105";
    String admission_no = "123456789";
    String registerCourse() {
        if (matric_no.isEmpty() || admission_no.isEmpty()) {
            return "You cannot register your courses at this moment";
        } else {
            return "You have registered for all courses";
        }
    }
    String checkResults() {
        if (matric_no.isEmpty() || admission_no.isEmpty()) {
            return "Cannot check your result.";
        } else {
            return "You got 8As, 2Bs and 1C";
        }
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Andrew Christabel";
        student.password = "123456";
        System.out.println(student.register());
        System.out.println(student.registerCourse());
        System.out.println(student.checkResults());
    }
}
