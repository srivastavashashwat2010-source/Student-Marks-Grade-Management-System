public class Person {

    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
    }
}