public class Marks {

    private double javaMarks;
    private double dbmsMarks;
    private double osMarks;
    private double cnMarks;
    private double mathsMarks;

   

    public Marks(double javaMarks,
                 double dbmsMarks,
                 double osMarks,
                 double cnMarks,
                 double mathsMarks) {

        this.javaMarks = javaMarks;
        this.dbmsMarks = dbmsMarks;
        this.osMarks = osMarks;
        this.cnMarks = cnMarks;
        this.mathsMarks = mathsMarks;
    }

    

    public double calculateTotal() {

        return javaMarks + dbmsMarks + osMarks
                + cnMarks + mathsMarks;
    }

    

    public double calculatePercentage() {

        return calculateTotal() / 5;
    }

    

    public void displayMarks() {

        System.out.println("\n------------- MARKS -------------");

        System.out.println("Java              : " + javaMarks);
        System.out.println("DBMS              : " + dbmsMarks);
        System.out.println("Operating System  : " + osMarks);
        System.out.println("Computer Networks : " + cnMarks);
        System.out.println("Mathematics       : " + mathsMarks);
    }
}