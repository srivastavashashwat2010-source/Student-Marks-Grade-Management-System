public class Result {

    private Student student;
    private Marks marks;

    

    public Result(Student student, Marks marks) {

        this.student = student;
        this.marks = marks;
    }

   

    public String calculateGrade(double percentage) {

        if (percentage >= 90) {
            return "A+";
        }
        else if (percentage >= 80) {
            return "A";
        }
        else if (percentage >= 70) {
            return "B";
        }
        else if (percentage >= 60) {
            return "C";
        }
        else if (percentage >= 50) {
            return "D";
        }
        else if (percentage >= 40) {
            return "E";
        }
        else {
            return "F";
        }
    }

    

    public void displayResult() {

        student.displayDetails();

        marks.displayMarks();

        double total = marks.calculateTotal();

        double percentage = marks.calculatePercentage();

        String grade = calculateGrade(percentage);

        System.out.println("\n------------- RESULT -------------");

        System.out.println("Total      : " + total + " / 500");
        System.out.println("Percentage : " + percentage + "%");
        System.out.println("Grade      : " + grade);

        System.out.println("\n========================================");
        System.out.println("          RESULT GENERATED");
        System.out.println("========================================");
    }
}