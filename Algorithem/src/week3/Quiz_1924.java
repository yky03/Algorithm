package week3;

import java.util.Scanner;

public class Quiz_1924 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int x = 0;
		int y = 0;
		
		while(x<1 || x>12 || y<1 || y>31) {
			x= scan.nextInt();
			y= scan.nextInt();
		}
		
		
		//2007��1��1�� ������ ~ 2007�� x��y��
		//�ϼ��� ���Ѵ�
		//��ȭ��������� �ݺ�
		//������ 0�̸� ���� ������1�̸� ȭ��...
		
		int sum = 0;
		for(int i=1; i<=x; i++) {
			if(i==x) {
				sum += (y-1);
			} else {
				if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12) {
					sum += 31;
				} else if(i==4 || i==6 || i==9 || i==11) {
					sum += 30;
				} else if(i==2) {
					sum += 28;
				}
			}
		}
		
		if(sum%7 == 0) {
			System.out.println("MON");
		} else if(sum%7 == 1) {
			System.out.println("TUE");
		} else if(sum%7 == 2) {
			System.out.println("WED");
		} else if(sum%7 == 3) {
			System.out.println("THU");
		} else if(sum%7 == 4) {
			System.out.println("FRI");
		} else if(sum%7 == 5) {
			System.out.println("SAT");
		} else if(sum%7 == 6) {
			System.out.println("SUN");
		}
		
		
		
		
		
	}

}
