package week4;

import java.util.Scanner;

public class Quiz_4344 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i=0; i<n; i++) {
			
			int sum = 0;
			int m = scan.nextInt();
			int gr[] = new int[m];
			for(int j=0; j<m; j++) {
				gr[j] = scan.nextInt();
				sum += gr[j];
			}
			double avg = (double)sum/m;
			int count = 0;
			for(int j=0; j<m; j++) {
				if(gr[j] > avg) {
					count +=1;
				}
			}
			double a = ((double)count/(double)m);
			System.out.printf("%.3f" , a*100);
			System.out.print("%");
			System.out.println();
			
			
		}

	}

}
