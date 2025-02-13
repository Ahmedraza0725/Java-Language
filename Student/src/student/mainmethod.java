package student;
public class mainmethod {
    public static void main(String[] args) {
        // Creating three Student objects
        Student student1 = new Student(1, 3, 3.8);
        Student student2 = new Student(2, 5, 3.6);
        Student student3 = new Student(3, 1, 3.9);

        // Displaying details of all students
        System.out.println("Student Details:");
        student1.showDetails();
        student2.showDetails();
        student3.showDetails();
    }
} 