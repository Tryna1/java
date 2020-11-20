package HomeWork4;
import java.util.Scanner;

public class _7_31 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] list1 = new int[110];
		int[] list2 = new int[110];
		System.out.print("Enter listl:");
		int n1 = input.nextInt();
		for(int i = 1; i <= n1; i++) list1[i] = input.nextInt();
		System.out.print("Enter list2:");
		int n2 = input.nextInt();
		for(int i = 1; i <= n2; i++) list2[i] = input.nextInt();
		System.out.print("The merged list is");
		int i = 1;
		int j = 1;
		int num = 1;
		int[] list = new int[250];
		while(true) {
			if(list1[i] > list2[j]) {
				list[num] = list2[j];
				if(j != n2) j = j + 1;
				else list2[j] = 999999;
			}
			else {
				list[num] = list1[i];
				if(i != n1) i = i + 1;
				else list1[i] = 999999;
			}
			if(num == list1.length + list2.length) break;
			num = num + 1;
		}
		for(int k = 1; k <= n1 + n2; k++) System.out.print(" " + list[k]);
	}
}
