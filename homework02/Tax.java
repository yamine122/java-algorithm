package homework02;

import java.util.Scanner;

public class Tax {
/**	To 개발자님
	클라이언트에서 프로그램 개발 요청이 왔습니다.
	이름과 연봉을 입력받아서
	연봉 ***만원을 받으시는 XXX님께서 납부할 세금은 ???만원입니다.
	로 출력하는 프로그램을 만들어 주세요.
	단) 세율이 정책이 바뀔 때 마다 변하니,
	관리자가 쉽게 적용가능하도록 만들어 주세요.
	현재는 세율이 9.7프로라고 합니다.
*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = "";
		System.out.println("이름을 입력해주세요");
		name = scan.next();
		int money = 0;
		System.out.println("연봉을  입력해주세요");
		money = scan.nextInt();
		double rate = 0.0;
		System.out.println("세율을 입력해주세요");
		rate = scan.nextDouble();
		
		
		System.out.println("연봉"+money/10000+"만원을 받으시는"+name+"님께서 납부할 세금은"+Math.round(money/rate)/10000+"만원입니다");

	}

}