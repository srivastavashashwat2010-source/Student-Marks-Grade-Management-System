public class InputValidator {

    
    public static double validateMarks(double marks) {

        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException(
                    "Marks must be between 0 and 100."
            );
        }

        return marks;
    }

    
    public static int validateRollNumber(int rollNo) {

        if (rollNo <= 0) {
            throw new IllegalArgumentException(
                    "Roll number must be greater than 0."
            );
        }

        return rollNo;
    }

   
    public static String validateName(String name) {

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Name cannot be empty."
            );
        }

        return name;
    }
}