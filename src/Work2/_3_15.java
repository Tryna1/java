package Work2;
import java.util.Scanner;

public class _3_15 {
	
  public static void main(String[] args) {
	  int a = (int)(Math.random()*900+100);
	  Scanner input = new Scanner(System.in);
	  System.out.print("输入一个三位整数: ");
	  int b = input.nextInt();
	  int a1 , a2 , a3 , b1 , b2 , b3;
	  a1 = a/100;
	  a2 = a/10%10;
	  a3 = a%10;
	  b1 = b/100;
	  b2 = b/10%10;
	  b3 = b%10;
	  if(a == b) {
		  System.out.println("奖金是 10000 美元");
	  }
	  else if(((a1==b1)&&(a2==b2)&&(a3==b3))||((a1==b1)&&(a2==b3)&&(a2==b3))||((a1==b2)&&(a2==b1)&&(a3==b3))||(a1==b2)&&(a2==b3)&&(a3==b1)||((a1==b3)&&(a2==b2)&&(a3==b1))||(a1==b3)&&(a2==b1)&&(a3==b2)) {
		  System.out.println("奖金是 3000 美元");
	  }
	  else if((a1==b1)||(a1==b2)||(a1==b3)||(a2==b1)||(a2==b2)||(a2==b3)||(a3==b1)||(a3==b2)||(a3==b3)) {
		  System.out.println("奖金是 1000 美元");
	  }
	  else System.out.println("没有奖金");
}

}
