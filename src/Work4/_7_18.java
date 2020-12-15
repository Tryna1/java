package HomeWork4;
import java.util.Scanner;

public class _7_18 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double[] a = new double[15];
		System.out.println("输入10个浮点数:");
		for(int i = 1; i <= 10; i++) {
			a[i] = input.nextDouble();
		}
		for(int i = 1; i < 10; i++) {
			for(int j = i + 1; j <= 10; j++) {
				if(a[i] > a[j]) {
					double tmp1 = a[i];
					a[i] = a[j];
					a[j] = tmp1;
				}
			}
		}
		for(int i = 1; i <= 10; i++) System.out.println(a[i]);
		
	}
}
