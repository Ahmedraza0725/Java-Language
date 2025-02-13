/*package hierarchicaldemo;
// Interface Y
interface Y {
    void mull(int a, int b); // Abstract method for multiplication
}

// Interface X extends Y
interface X extends Y {
    void add(int a, int b); // Abstract method for addition
    void sub(int a, int b); // Abstract method for subtraction
}

// Class A implements X
class A implements X {
    @Override
    public void mull(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    @Override
    public void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    @Override
    public void sub(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }
}

// Main class to test the program
public class HierarchicalDemo {
    public static void main(String[] args) {
        A obj = new A(); // Create an object of class A
        
        // Perform operations
        obj.add(10, 5);    // Addition
        obj.sub(10, 5);    // Subtraction
        obj.mull(10, 5);   // Multiplication
    }
}
*/