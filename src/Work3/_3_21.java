package HomeWork3;
import java.util.Scanner;

public class _3_21 {
	
  public static void main(String[] args) {
  	Scanner input = new Scanner(System.in);
  	System.out.print("Enter year: (e.g., 2012): ");
  	int year = input.nextInt();
  	System.out.print("Enter month: 1-12: ");
  	int month = input.nextInt();
  	System.out.print("Enter the day of the month: 1-31: ");
  	int day = input.nextInt();
	    double q = day;
	    double m = month;
	    if(month==1||month==2) {
	    	m+=12;
	    	year-=1;
	    };
	    double j = (int)(year/100) ;
	    double k = year%100;
	    double h = (q + (26*(m+1)/10) + k + (k/4) + (j/4) + 5*j);
	    h = (int)(h%7);
	    System.out.print("Day of the week is ");
	    if(h == 0) System.out.println("Saturday");
	    else if(h == 1) System.out.println("Sunday");
	    else if(h == 2) System.out.println("Monday");
	    else if(h == 3) System.out.println("Tuesday");
	    else if(h == 4) System.out.println("Wednesday");
	    else if(h == 5) System.out.println("Thursday");
	    else System.out.println("Friday");
}

}
