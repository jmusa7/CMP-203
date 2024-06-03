package OOP;

public class Student extends User{

    String matric_no = "BHU/22/04/05/0002";
    String admission_no = "Ayoisthebest";

    String login() {

        if (admission_no.isEmpty() || matric_no.isEmpty()){
            return "Can't be empty";
        }
        else {
            return "Success";
        }
    }
    void registerCourses() {

        System.out.println("Course");
    }
    String checkResult() {
        if (admission_no.equals("") || matric_no.equals("")) {
            return "Can't check your result";
        } else {
            return "You can check your result";
        }
    }
    
    public static void main(String[] args) {
        Student student;
        student = new Student();
        student.name = "Ayomide Oyewole";
        student.password = "12345";
        student.registerCourses();
        System.out.println(student.checkResult());
    }
}

