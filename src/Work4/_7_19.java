package HomeWork4;
import java.util.Scanner;

public class _7_19 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] a = new int[110];
		System.out.println("Enter list: ");
		int n = input.nextInt();
		for(int i = 1; i <= n; i++) {
			a[i] = input.nextInt();
		}
		int flag = 0;
		for(int i = 1; i < n; i++) {
			if(a[i] > a[i + 1]) {
				flag = 1;
				break;
			}
		}
		if(flag == 1) System.out.println("The list is not sorted");
		else System.out.println("The list is already sorted");
		
	}
}
