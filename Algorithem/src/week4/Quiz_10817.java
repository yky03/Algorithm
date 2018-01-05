package week4;

import java.util.Scanner;

public class Quiz_10817 {
	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while (a<1 || a>100 || b<1 || b>100 || c<1 || c>100) {
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();
		}
		
		int[] group = {a,b,c};
		int temp = 0;
		
		for(int i=0; i<group.length; i++) {
			for(int j=i+1; j<group.length; j++) {
				if(group[i] < group[j]) {
					temp = group[i];
					group[i] = group[j];
					group[j] = temp;
				}
			}
		}
		
		System.out.println(group[1]);
		
	}
}
