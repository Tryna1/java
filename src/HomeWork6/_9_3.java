package HomeWork6;
import java.util.Date;

public class _9_3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long base = 10000;
		Date data = new Date(base);
		System.out.println(base + ": " + data.toString());
		for(int i = 1; i <= 7; i++) {
			base *= 10;
			data.setTime(base);
			System.out.println(base + ": " + data.toString());
		}
	}

}
