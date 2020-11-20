package HomeWork4;
import java.util.Scanner;

public class _7_32 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] a = new int[110];
		System.out.print("Enter list:");
		int n = input.nextInt();
		int num = 1;
		for(int i = 1; i <= n; i++) {
			a[i] = input.nextInt();
			if(a[i] < a[1]) num = num + 1;
		}
		int[] b = new int[110];
		int cnt1 = 1;
		int cnt2 = 1;
		b[num] = a[1];
		for(int i = 2; i <= n; i++) {
			if(a[i] < a[1]) {
				b[cnt1] = a[i];
				cnt1 = cnt1 + 1;
			}
			else {
				b[num + cnt2] = a[i];
				cnt2 = cnt2 + 1;
			}
		}
		System.out.print("After the partition, the list is");
		for(int i = 1; i <= n; i++) System.out.print(" " + b[i]);
	}
}
