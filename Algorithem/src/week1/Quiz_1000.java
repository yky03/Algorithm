package week1;

import java.util.Scanner;

public class Quiz_1000 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int A;
		int B;
		do {
			A = input.nextInt();
			B = input.nextInt();
		} while( A <= 0 || B >= 10);
		
		System.out.println(A+B);
	}

}
