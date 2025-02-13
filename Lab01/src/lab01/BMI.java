package lab01;
import java.util.Scanner;
public class BMI{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double weight,inches,height,bmi;
        System.out.println("Enter your weight in kilograms: ");
        weight = sc.nextDouble();
        System.out.println("Enter your height in inches: ");
        inches = sc.nextDouble();
        height = inches * 0.0254;
        bmi = weight/(height*height);
        System.out.println("Your BMI is: " + bmi);
        System.out.println("By Ahmed Raza");
    }
}