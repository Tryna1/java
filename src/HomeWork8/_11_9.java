package HomeWork8;

import java.util.ArrayList;
import java.util.Scanner;

public class _11_9 {
	public static void main(String[] args) {
		int [][] a = new int[1010][1010];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the array size n:");
		int n = input.nextInt();
		for(int i = 0 ; i < n; i++) {
			for(int j = 0; j < n; j++) {
				a[i][j] = (Math.random()>0.5?0:1);
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		int [] row = new int[1010];
		int [] column = new int [1010];
		int sum = 0, maxx = -999;
		for(int i = 0; i < n; i++) {
			sum = 0;
			for(int j = 0; j < n; j++) {
				if(a[i][j] == 1) sum++;
			}
			row[i] = sum;
			if(sum > maxx) maxx = sum;
		}
		System.out.print("The largest row index:");
		for(int i = 0; i < n; i++) {
			if(row[i] == maxx) System.out.print(" " + i);
		}
		maxx = -999;
		for(int i = 0; i < n; i++) {
			sum = 0;
			for(int j = 0; j < n; j++) {
				if(a[j][i] == 1) sum++;
			}
			column[i] = sum;
			if(sum > maxx) maxx = sum;
		}
		System.out.println();
		System.out.print("The largest column index:");
		for(int i = 0 ; i < n; i++) {
			if(column[i] == maxx) System.out.print(" " + i);
		}
	}
}
