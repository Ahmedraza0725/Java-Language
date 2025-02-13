package student;
class Student {
    // Private fields
    private int rollNo;
    private int semester;
    private double GPA;

    // Constructor to initialize fields
    public Student(int rollNo, int semester, double GPA) {
        this.rollNo = rollNo;
        this.semester = semester;
        this.GPA = GPA;
    }

    // Method to get details (individual field getters can also be created if needed)
    public void getDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Semester: " + semester);
        System.out.println("GPA: " + GPA);
        System.out.println("Ahmed Raza : 008");
    }

    // Method to display all details (alternative to separate getters)
    public void showDetails() {
        System.out.println("----------------------------");
        getDetails();
    }
}
