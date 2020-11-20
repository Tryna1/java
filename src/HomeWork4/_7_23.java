package HomeWork4;


public class _7_23 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[110];
		for(int i = 1; i <= 100; i++) {
			for(int j = i; j <= 100; j = j + i)
				a[j] = 1 - a[j];
		}
		System.out.println("开着的柜子有");
		for(int i = 1; i <= 100; i++) {
			if(a[i] == 1) System.out.println(i);
		}
		
	}
}
