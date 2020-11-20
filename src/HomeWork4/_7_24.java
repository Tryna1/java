package HomeWork4;
import java.util.Scanner;

public class _7_24 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int f1 = 0;
		int f2 = 0;
		int f3 = 0;
		int f4 = 0;
		int num = 0;
		while(true) {
			int a = (int)(Math.random()*52+1);
			num++;
			if(a <= 13) {
				if(f1 == 0) {
					if(a == 11) System.out.println("Jack of Spades");
					else if(a == 12) System.out.println("Queen of Spades");
					else if(a == 13) System.out.println("King of Spades");
					else System.out.println(a + " of Spades");
				}
				f1 = 1;	
			}
			else if(a <= 26) {
				a = a - 13;
				if(f2 == 0) {
					if(a == 11) System.out.println("Jack of Clubs");
					else if(a == 12) System.out.println("Queen of Clubs");
					else if(a == 13) System.out.println("King of Clubs");
					else System.out.println(a + " of Clubs");
				}
				f2 = 1;
			}
			else if(a <= 39) {
				a = a - 26;
				if(f3 == 0) {
					if(a == 11) System.out.println("Jack of Hearts");
					else if(a == 12) System.out.println("Queen of Hearts");
					else if(a == 13) System.out.println("King of Hearts");
					else System.out.println(a + " of Hearts");
				}
				f3 = 1;
			}
			else {
				a = a - 39;
				if(f4 == 0) {
					if(a == 11) System.out.println("Jack of Diamonds");
					else if(a == 12) System.out.println("Queen of Diamonds");
					else if(a == 13) System.out.println("King of Diamonds");
					else System.out.println(a + " of Diamonds");
				}
				f4 = 1;
			}
			if(f1 == 1 && f2 == 1 && f3 == 1 && f4 == 1) break;
		}
		System.out.println("Number of picks: " + num);
	}
}
