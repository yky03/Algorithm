package week1;

import java.util.Scanner;

public class Quiz_11718 {
    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
        char chr;
         
        while(scan.hasNextLine()) {
            String input = scan.nextLine();
            if(!(input.isEmpty() || input.length()>100)){
                for(int i=0; i<input.length(); i++) {
                    chr = input.charAt(i);
                     
                    //���ĺ� �ҹ���, �빮��, ����, ����
                    if(chr>=0x61 && chr<=0x7A || (chr>=0x41 && chr<=0x5A) || (chr==' ') || (chr>=0x30 && chr<=0x39)) {
                         
                    }else { //�ҹ���, �빮��, ����, ���ڰ� �ƴϸ� break
                        break;
                    }
                }
                System.out.println(input);
            }
        }
        
     /*   �Է��� ���ĺ� �ҹ���, �빮��, ����, ���ڷθ� �̷������ �ϴ� ������ �ֽ��ϴ�.
        ASCII�ڵ�ǥ�� �����Ͽ� �ڵ带 �ۼ��ؾ� �մϴ�.
        - ���ĺ� �ҹ��� : a(0x61)~z(0x7A)
        - ���ĺ� �빮�� : A(0x41) ~ Z(0x5A)
        - ���� : 0(0x30) ~ 9(0x39)*/
    }
}
