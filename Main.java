import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentManager manager = new StudentManager();

        int choice = 0;

        do {

            System.out.println("\n========================================");
            System.out.println("      STUDENT MARKS MANAGEMENT SYSTEM");
            System.out.println("========================================");

            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Generate Result");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("\nEnter your choice: ");

            try {

                choice = sc.nextInt();

                switch (choice) {

                    
                    case 1:

                        try {

                            System.out.print(
                                    "Enter Roll Number: "
                            );

                            int rollNo = sc.nextInt();

                            InputValidator.validateRollNumber(
                                    rollNo
                            );

                            

                            if (manager.searchStudent(rollNo) != null) {

                                System.out.println(
                                        "Roll number already exists!"
                                );

                                break;
                            }

                            sc.nextLine();

                            System.out.print(
                                    "Enter Student Name: "
                            );

                            String name = sc.nextLine();

                            InputValidator.validateName(name);

                            System.out.print(
                                    "Enter Course: "
                            );

                            String course = sc.nextLine();

                            Student student =
                                    new Student(
                                            rollNo,
                                            name,
                                            course
                                    );

                            

                            System.out.println(
                                    "\nEnter Marks out of 100:"
                            );

                            System.out.print("Java: ");
                            double javaMarks =
                                    sc.nextDouble();

                            InputValidator.validateMarks(
                                    javaMarks
                            );

                            System.out.print("DBMS: ");
                            double dbmsMarks =
                                    sc.nextDouble();

                            InputValidator.validateMarks(
                                    dbmsMarks
                            );

                            System.out.print(
                                    "Operating System: "
                            );

                            double osMarks =
                                    sc.nextDouble();

                            InputValidator.validateMarks(
                                    osMarks
                            );

                            System.out.print(
                                    "Computer Networks: "
                            );

                            double cnMarks =
                                    sc.nextDouble();

                            InputValidator.validateMarks(
                                    cnMarks
                            );

                            System.out.print(
                                    "Mathematics: "
                            );

                            double mathsMarks =
                                    sc.nextDouble();

                            InputValidator.validateMarks(
                                    mathsMarks
                            );

                            Marks marks =
                                    new Marks(
                                            javaMarks,
                                            dbmsMarks,
                                            osMarks,
                                            cnMarks,
                                            mathsMarks
                                    );

                          

                            student.setMarks(marks);

                            manager.addStudent(student);

                            System.out.println(
                                    "\nStudent added successfully!"
                            );

                        }
                        catch (IllegalArgumentException e) {

                            System.out.println(
                                    "Error: " + e.getMessage()
                            );
                        }

                        break;


                    case 2:

                        manager.displayAllStudents();

                        break;


                   
                    case 3:

                        try {

                            System.out.print(
                                    "Enter Roll Number: "
                            );

                            int searchRoll = sc.nextInt();

                            InputValidator.validateRollNumber(
                                    searchRoll
                            );

                            Student found =
                                    manager.searchStudent(
                                            searchRoll
                                    );

                            if (found != null) {

                                found.displayDetails();

                            }
                            else {

                                System.out.println(
                                        "Student not found!"
                                );
                            }

                        }
                        catch (IllegalArgumentException e) {

                            System.out.println(
                                    "Error: " + e.getMessage()
                            );
                        }

                        break;


                    case 4:

                        try {

                            System.out.print(
                                    "Enter Roll Number: "
                            );

                            int resultRoll = sc.nextInt();

                            Student resultStudent =
                                    manager.searchStudent(
                                            resultRoll
                                    );

                            if (resultStudent == null) {

                                System.out.println(
                                        "Student not found!"
                                );

                                break;
                            }

                            if (resultStudent.getMarks() == null) {

                                System.out.println(
                                        "Marks not available!"
                                );

                                break;
                            }

                            Result result =
                                    new Result(
                                            resultStudent,
                                            resultStudent.getMarks()
                                    );

                            ReportThread reportThread =
                                    new ReportThread(result);

                            reportThread.start();

                        }
                        catch (Exception e) {

                            System.out.println(
                                    "Error: " + e.getMessage()
                            );
                        }

                        break;



                    case 5:

                        System.out.print(
                                "Enter Roll Number to delete: "
                        );

                        int deleteRoll = sc.nextInt();

                        if (manager.deleteStudent(deleteRoll)) {

                            System.out.println(
                                    "Student deleted successfully!"
                            );

                        }
                        else {

                            System.out.println(
                                    "Student not found!"
                            );
                        }

                        break;


                  
                    case 6:

                        System.out.println(
                                "\nThank you for using the system!"
                        );

                        break;


                    default:

                        System.out.println(
                                "Invalid choice!"
                        );
                }

            }
            catch (java.util.InputMismatchException e) {

                System.out.println(
                        "Error: Please enter a valid number."
                );

                sc.nextLine();

                choice = 0;
            }

        } while (choice != 6);

        sc.close();
    }
}