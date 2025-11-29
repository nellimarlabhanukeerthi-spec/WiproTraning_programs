/*Create a Student Class, and apply getter and setter methods to give access to private variable marks.*/

class Student {
    // Private variable
    private int marks;

    // Getter method
    public int getMarks() {
        return marks;
    }

    // Setter method
    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) { // simple validation
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Must be between 0 and 100.");
        }
    }
}

// Demo class
public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setMarks(85); // setting marks
        System.out.println("Student Marks: " + s1.getMarks());
    }
}
