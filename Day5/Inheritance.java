/*- Create a Person class with a name and displayInfo() method. Create a Student class that extends Person, adds a rollNumber, and overrides displayInfo().
Use super to call the parent class method inside the overridden method.*/

// Parent class
class Person {
    String name;

    // Constructor
    Person(String name) {
        this.name = name;
    }

    // Method to display info
    void displayInfo() {
        System.out.println("Name: " + name);
    }
}

// Child class
class Student extends Person {
    int rollNumber;

    // Constructor
    Student(String name, int rollNumber) {
        super(name); // Calling parent class constructor
        this.rollNumber = rollNumber;
    }

    // Overriding method
    @Override
    void displayInfo() {
        super.displayInfo(); // Calling parent class method
        System.out.println("Roll Number: " + rollNumber);
    }
}

// Main class to test
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101);
        s1.displayInfo();
    }
}
