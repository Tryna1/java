package HomeWork6;
import java.util.Scanner;

public class _9_10 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a, b, c: ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		QuadraticEquation q = new QuadraticEquation(a, b, c);
		if(q.getDiscriminant() < 0) {
			System.out.println("The equation has no roots.");
		}
		else if(q.getDiscriminant() == 0) {
			System.out.println(q.getRoot1());
		}
		else {
			System.out.println(q.getRoot1() + " " +  q.getRoot2());
		}
	}

}
