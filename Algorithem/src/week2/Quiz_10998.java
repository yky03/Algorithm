package week2;

import java.util.Scanner;

public class Quiz_10998 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		while(a <= 0 || b>=10) {
			a = scan.nextInt();
			b = scan.nextInt();
		}
		
		System.out.println(a*b);

	}
}
