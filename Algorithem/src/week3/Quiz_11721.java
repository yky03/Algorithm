package week3;

import java.util.Scanner;

public class Quiz_11721 {

	public static void main(String[] args) {
		//65~90 A~Z , 97~122 a~z
		
		Scanner scan = new Scanner(System.in);
		String n = scan.nextLine();
		/*boolean ch = true;
		while(ch) {
			for(int i=0; i<n.length(); i++) {
				char check = n.charAt(i);
				if(((int)check >= 65 && (int)check <= 90) || ((int)check>=97 && (int)check<=122)) {
					ch = false;
				} else {
					ch = true;
					break;
				}
			}
		}*/
	
		
		while(n.length()==0 || n.length()>100) {
				n = scan.nextLine();
		}
		
		
		int a = n.length()/10;
		int b = n.length()%10;
		int c = 0;
		
		for(int i=0; i<a+1; i++) {
			if(a==0) {
				System.out.println(n.substring(c, c+b));
			} else {
				if(a==i) {
				System.out.println(n.substring(c, c+b));	
				} else {
				System.out.println(n.substring(c, c+10));
						c+=10;
				}
			}
		}
		
		
		
	}

}
