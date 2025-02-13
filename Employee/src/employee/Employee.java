/*package employee;
class Employee {
    // Fields for Employee details
    int emp_code;
    String name;
    String designation;
    double salary;

    // Default constructor
    public Employee() {
        this.emp_code = 0;
        this.name = "Unknown";
        this.designation = "Unknown";
        this.salary = 0.0;
    }

    // Constructor with emp_code, name, and designation
    public Employee(int emp_code, String name, String designation) {
        this.emp_code = emp_code;
        this.name = name;
        this.designation = designation;

        // Set salary based on designation
        switch (designation.toLowerCase()) {
            case "clerk":
                this.salary = 5000;
                break;
            case "peon":
                this.salary = 2000;
                break;
            case "manager":
                this.salary = 10000;
                break;
            default:
                this.salary = 1000;
                break;
        }
    }

    // Constructor with emp_code, name, designation, and salary
    public Employee(int emp_code, String name, String designation, double salary) {
        this.emp_code = emp_code;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    // Method to display employee details
    public void display() {
        System.out.println("------------------------------");
        System.out.println("Employee Code: " + emp_code);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: Rs. " + salary);
    }
}*/