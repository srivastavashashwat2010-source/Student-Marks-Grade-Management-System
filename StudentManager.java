import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students;

   

    public StudentManager() {
        students = new ArrayList<>();
    }

    

    public boolean addStudent(Student student) {

        if (searchStudent(student.getRollNo()) != null) {

            return false;
        }

        students.add(student);

        return true;
    }

   

    public Student searchStudent(int rollNo) {

        for (Student student : students) {

            if (student.getRollNo() == rollNo) {

                return student;
            }
        }

        return null;
    }

    

    public void displayAllStudents() {

        if (students.isEmpty()) {

            System.out.println("No students available.");

            return;
        }

        System.out.println("\n========== ALL STUDENTS ==========");

        for (Student student : students) {

            student.displayDetails();

            if (student.getMarks() != null) {

                double percentage =
                        student.getMarks().calculatePercentage();

                System.out.println(
                        "Percentage : " + percentage + "%"
                );
            }

            System.out.println("----------------------------------");
        }
    }

   

    public boolean deleteStudent(int rollNo) {

        Student student = searchStudent(rollNo);

        if (student != null) {

            students.remove(student);

            return true;
        }

        return false;
    }

    
    public int getStudentCount() {

        return students.size();
    }
}