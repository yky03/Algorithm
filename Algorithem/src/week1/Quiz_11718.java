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
                     
                    //알파벳 소문자, 대문자, 공백, 숫자
                    if(chr>=0x61 && chr<=0x7A || (chr>=0x41 && chr<=0x5A) || (chr==' ') || (chr>=0x30 && chr<=0x39)) {
                         
                    }else { //소문자, 대문자, 공백, 숫자가 아니면 break
                        break;
                    }
                }
                System.out.println(input);
            }
        }
        
     /*   입력은 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져야 하는 조건이 있습니다.
        ASCII코드표를 참고하여 코드를 작성해야 합니다.
        - 알파벳 소문자 : a(0x61)~z(0x7A)
        - 알파벳 대문자 : A(0x41) ~ Z(0x5A)
        - 숫자 : 0(0x30) ~ 9(0x39)*/
    }
}
