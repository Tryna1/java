package HomeWork4;
import java.util.Scanner;
import java.util.Arrays;

public class _7_34 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		sort("acb");
		
	}
	public static void sort(String s) {
		char [] a=s.toCharArray();
		Arrays.sort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]);
		}
	}
}
