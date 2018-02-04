package week6;

import java.util.Scanner;

public class Quiz_2577 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int gob = a*b*c;
		int[] check = new int[10];
		
		String gobs = String.valueOf(gob);
		for(int i=0; i<gobs.length(); i++) {
			if(gobs.charAt(i) == '0') {
				check[0]++;
			} else if(gobs.charAt(i) == '1') {
				check[1]++;
			} else if(gobs.charAt(i) == '2') {
				check[2]++;
			} else if(gobs.charAt(i) == '3') {
				check[3]++;
			} else if(gobs.charAt(i) == '4') {
				check[4]++;
			} else if(gobs.charAt(i) == '5') {
				check[5]++;
			} else if(gobs.charAt(i) == '6') {
				check[6]++;
			} else if(gobs.charAt(i) == '7') {
				check[7]++;
			} else if(gobs.charAt(i) == '8') {
				check[8]++;
			} else if(gobs.charAt(i) == '9') {
				check[9]++;
			}
		}
		
		for(int i=0; i<check.length; i++) {
			System.out.println(check[i]);
		}
		
		
	}
}
