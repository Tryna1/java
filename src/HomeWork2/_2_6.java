package HomeWork2;
import java.util.Scanner;

public class _2_6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an degree in Fahrenheit: ");
        double fahrenheit=input.nextDouble();
        double celsius=(5.0/9)*(fahrenheit-32);
        System.out.println("Fahrenheit "+fahrenheit +" is "+
        celsius+" in Celsius");

    } 
}
