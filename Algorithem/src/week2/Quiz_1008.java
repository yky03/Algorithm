package week2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Quiz_1008 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		while(a <= 0 || b>=10) {
			a = scan.nextInt();
			b = scan.nextInt();
		}
		
		DecimalFormat format = new DecimalFormat(".##########");
		
		System.out.printf(String.valueOf(format.format((double)a/b)));
	}
}