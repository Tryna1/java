package Work2;
import java.util.Scanner;

public class _3_9 {
	
  public static void main(String[] args) { 
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter the first 9 digits of an ISBN as integer: ");
	  int[]  d=new int[20];
	  int D = input.nextInt();
	  for(int i = 9; i>= 1 ;i-- ) {
		  d[i] = D%10;
		  D = D/10;
		  d[10] +=d[i]*i;
	  }
	  d[10] %= 11;
	  System.out.print("The ISBN-10 number is ");
	  for(int i = 1; i<= 9;i++) {
		  System.out.print(d[i]);
	  }
	  if(d[10] == 10) System.out.print("X");
	  else  System.out.print(d[10]);
}

}
