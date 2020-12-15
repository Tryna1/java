package Work2;

public class _3_4 {
	
	public static void main(String[] args) {
		int month = (int)(Math.random()*12+1);
		String s = new String ("");
		if(month == 1) {
			s="January";
		}
		else if(month == 2) {
			s="February";
		}
		else if(month == 3) {
			s="March";
		}
		else if(month == 4) {
			s="April";
		}
		else if(month == 5) {
			s="May";
		}
		else if(month == 6) {
			s="June";
		}
		else if(month == 7) {
			s="July";
		}
		else if(month == 8) {
			s="August";
		}
		else if(month == 9) {
			s="September";
		}
		else if(month == 10) {
			s="October";
		}
		else if(month == 11) {
			s="November";
		}
		else if(month == 12) {
			s="December";
		}
		System.out.println(s);
	}

}
