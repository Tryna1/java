package HomeWork6;
import java.util.Scanner;

public class _9_11 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b, c, d, e, f:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		LinearEquation L  = new LinearEquation(a, b, c, d, e, f);
		if(!L.isSolvable()) System.out.println("The equation has no solution");
		else {
			System.out.println("x is " + L.getX() + " and y is " + L.getY());
		}
	}

}
