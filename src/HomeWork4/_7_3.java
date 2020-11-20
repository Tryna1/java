package HomeWork4;
import java.util.Scanner;

public class _7_3 {
	
	public static void main(String[] args) {
		int[] a = new int[110];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the integers between 1 and 100:");
		while(true) {
			int b = input.nextInt();
			if(b == 0) break;
			a[b] = a[b] + 1;
		}
		for(int i = 1; i <= 100; i++) {
			if(a[i] != 0) {
				System.out.print(i + " occurs " + a[i]);
				if(a[i] == 1) System.out.println(" time");
				else  System.out.println(" times");
			}
		}
	}
}
