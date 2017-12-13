package week2;

import java.util.Scanner;

public class Quiz_10430 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		while( a<2 || b<2 || c<2 || a>10000 || b>10000 || c>10000) {
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();
		}
		
		System.out.println((a+b)%c);
		System.out.println((a%c + b%c)%c);
		System.out.println((a*b)%c);
		System.out.println((a%c*b%c)%c);
		
	}
}
