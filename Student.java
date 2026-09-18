public class Student extends Person {

    private int rollNo;
    private String course;
    private Marks marks;

    
    public Student(int rollNo, String name, String course) {

        super(name);

        this.rollNo = rollNo;
        this.course = course;
    }

    

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public Marks getMarks() {
        return marks;
    }

   

    public void setMarks(Marks marks) {
        this.marks = marks;
    }


    @Override
    public void displayDetails() {

        System.out.println("\n----- Student Details -----");
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Name        : " + name);
        System.out.println("Course      : " + course);
    }
}