package study05;

import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Member member = null;
		Service service = new Service();
		while(true) {
			System.out.println("0.종료 1.회원가입 2.정보보기 3.아이디찾기 4.BMI");
			switch(scan.nextInt()) {
			case 0 : return;
			case 1 : 
				
				member = new Member();
			
				System.out.println("회원가입");
				System.out.println("아이디를 입력해주세요");
				member.setId(scan.next());
				System.out.println("비밀번호를 입력해주세요");
				member.setPassword(scan.next());
				System.out.println("이름을 입력해주세요");
				member.setName(scan.next());
				System.out.println("주민번호");
				member.setSsn(scan.next());
				System.out.println("키를 입력해주세요");
				member.setHeight(scan.nextDouble());
				System.out.println("몸무게를 입력해주세요");
				member.setWeight(scan.nextDouble());
				System.out.println("혈액형을 입력해주세요");
				member.setType(scan.next());
				System.out.println("국어점수");
				member.setKor(scan.nextInt());
				break;
			case 2 : 
				System.out.println(member.toString());
				
				break;
			
			case 3 :
				System.out.println("아이디 , 이름을 입력하면 아이디 알려줌");
				String searchName = scan.next();
				String searchId = scan.next();
				if(searchName.equals("a") &&
						searchId.equals("a")) {
					System.out.printf("찾는아이디:%s"
							+"주민번호 : %s", member.getId(), member.getSsn());
				}else {
					System.out.println("찾는아이디가 없습니다.");
				}
				break;
				
			case 4 : 
				System.out.println("BMI구하기");
				System.out.println(service.getBmi(member));
			
			}
		}

	}

}
