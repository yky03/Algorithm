package meet;

/*
You should use the statndard input/output

in order to receive a score properly.

Do not use file input and output

Please be very careful. 
*/

import java.util.Scanner;

/*
   As the name of the class should be Solution , using Solution.java as the filename is recommended.
   In any case, you can execute your program by running 'java Solution' command.
 */
class Solution3 {
	static int Answer;
	static int count;
	
	public static void main(String args[]) throws Exception	{
		
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));

		int T = 0;
		while(T<1 ||T>5) {
			T = sc.nextInt();
		}
		
		for(int test_case = 0; test_case < T; test_case++) {
			
			int K = sc.nextInt();
			int num[] = new int[K];
			for(int i=0; i<num.length; i++) {
				num[i] = sc.nextInt();
			}
			//�ڱ���� k�� ���ؼ� �ٸ����麸�� ũ���
			
			
			for(int i=0; i<num.length; i++) {
				count = 0;
				for(int j=0; j<num.length; j++) {
					if(num[i]+K >= num[j]) {
						count++;
					}
				}
				if(count == num.length) {
					Answer += 1;
				}
			}
			
			//���� ���� �ְ� �ּ��� �޾�����츦 ����
			//�迭 Ȥ�� �ִ밪
			
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	}
}
