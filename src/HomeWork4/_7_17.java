package HomeWork4;
import java.util.Scanner;

public class _7_17 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = new int[110];
		String[] name = new String[110];
		Scanner input = new Scanner(System.in);
		System.out.println("������ѧ���ĸ���");
		int n = input.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println("�������" + i + "��ѧ��������");
			name[i] = input.next();
			System.out.println("�������" + i + "��ѧ���ĳɼ�");
			score[i] = input.nextInt();
		}
		for(int i = 1; i < n; i++) {
			for(int j = i + 1; j <= n; j++) {
				if(score[i] < score[j]) {
					int tmp1 = score[i];
					score[i] = score[j];
					score[j] = tmp1;
					
					String tmp2 = name[i];
					name[i] = name[j];
					name[j] = tmp2;
				}
			}
		}
		for(int i = 1; i <= n; i++) System.out.println(name[i]);
		
	}
}
