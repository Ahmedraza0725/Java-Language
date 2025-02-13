package lab02;
public class Task5 {
    public static void main(String args[]){
        int a = 29 , b = 25 , c = 72;
        //Find the greatest number
        int greatest = a;
        if (b > greatest){
            greatest = b;
        }
        if(c > greatest){
            greatest = c;
        }
        //Find the smallest number
        int smallest = a;
        if (b < smallest){
            smallest = b;
        }
        if (c < smallest){
            smallest = c;
        }
        //Display the result
        System.out.println("The greatest number is: " + greatest);
        System.out.println("The smallest number is: " + smallest);
        System.out.println("By Ahmed Raza");
    }  
}
