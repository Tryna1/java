package HomeWork8;
import java.util.ArrayList;
import java.util.Scanner;

public class _11_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten integers: ");
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			list.add(input.nextInt());
		}
		removeDuplicate(list);
		System.out.print("The distinct integers are");
		for(int i = 0; i < list.size(); i++) System.out.print(" " + list.get(i));
	}
	
	public static void removeDuplicate(ArrayList<Integer> list) {
		for(int i = 0; i < list.size(); i++) {
			while(list.lastIndexOf(list.get(i)) != i) list.remove(i);
		}
	}

}
