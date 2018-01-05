package week4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Quiz_1546 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] point = new int[n];
		
		for(int i=0; i<point.length; i++) {
			point[i] = scan.nextInt();
		}
		
		int temp = 0;
		for(int i=0; i<point.length; i++) {
			for(int j=i+1; j<point.length; j++) {
				if(point[i] < point[j]) {
					temp = point[i];
					point[i] = point[j];
					point[j] = temp;
				}
			}
		}
		
		double sum = 0;
		for(int i=0; i<point.length; i++) {
			sum += ((double)point[i]/(double)point[0])*100; 
		}
		
		DecimalFormat fo = new DecimalFormat(".00");
		
		System.out.println(fo.format((double)sum/point.length));
		
		
	}
}
