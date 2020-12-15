package HomeWork4;
import java.util.Scanner;

public class _7_5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[110];
		int[] c = new int[110];
		int num = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers:");
		for(int i = 1; i <= 10 ; i++) {
			int b = input.nextInt();
			if(a[b] == 0) {  
				num = num + 1;
				c[num] = b;
			}
			a[b] = 1;
		}
		System.out.println("The number of distinct number is " + num);
		System.out.print("The distinct numbers are:");
		for(int i = 1; i <= num; i++) {
				System.out.print(" " + c[i]);
		}
	}
}
