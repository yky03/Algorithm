package week4;

import java.util.Scanner;

public class Quiz_1110 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = -1;
		while(n<0 || n>99) {
			n = scan.nextInt();
		}
		
		int temp = n;
		int count = 0;
		int a = 0;
		int b = 0;
		int num = -1;
		
		
		while(true) {
		if(n<10) {
			a = 0;
		    b = n;
		} else {
			a = n/10;
			b = n%10;
		}
		
			int sum = a+b;
			n = (b*10) + (sum%10); //새로운 숫자
			//System.out.println(n);
			count++;
			
			if(n==temp) {
				break;
			}
		}
	
		System.out.println(count);
		
		
	}

}
