package HomeWork6;
import java.util.GregorianCalendar;

public class _9_5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		int m =  gregorianCalendar.get(GregorianCalendar.MONTH);
		m += 1;
		System.out.println(gregorianCalendar.get(GregorianCalendar.YEAR) + "年" + m + 
				"月" + gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH) + "日");
		gregorianCalendar.setTimeInMillis(1234567898765L);
		m =  gregorianCalendar.get(GregorianCalendar.MONTH);
		m += 1;
		System.out.println(gregorianCalendar.get(GregorianCalendar.YEAR) + "年" + m + 
				"月" + gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH) + "日");
	}

}
