package p0831;

import java.util.Scanner;

public class Ja0831_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    System.out.printf("아이디를 입력하세요  : ");
		String id = scan.next(); //next();, nextLine();문자열, nextInt();정수, nextDouble();실수
		System.out.printf("패스워드를 입력하세요. : ");
		String pw = scan.next();
		
		System.out.println("아이디 :"+id);
		
		System.out.println("패스워드 :"+pw);
		
		System.out.printf("국어점수를 입력하세요. :");
		int kor = scan.nextInt();
		System.out.println("국어 :"+kor);
	}

}
