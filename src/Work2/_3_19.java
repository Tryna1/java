package Work2;
import java.util.Scanner;

public class _3_19 {
	
  public static void main(String[] args) {
  	Scanner input = new Scanner(System.in);
  	double a = input.nextDouble();
  	double b = input.nextDouble();
  	double c = input.nextDouble();
  	double C = a+b+c;
  	if((a+b>c)&&(a+c>b)&&(b+c>a)) {
  		System.out.println(C);
  	}
  	else System.out.println("输入的三角形不合法");
	 
}

}
