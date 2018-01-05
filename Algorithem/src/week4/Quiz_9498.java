package week4;

import java.util.Scanner;

public class Quiz_9498 {

	public static void main(String[] args) {
		int n = -1;
		char grade;
		
		Scanner scan = new Scanner(System.in);
		
		while (n<0 || n>100) {
			n = scan.nextInt();
		}
		
		if(n>=90 && n<=100) {
			grade = 'A';
		} else if(n>=80 && n<=89) {
			grade = 'B';
		} else if(n>=70 && n<=79) {
			grade = 'C';
		} else if(n>=60 && n<=69) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println(grade);
		
		
	}

}
