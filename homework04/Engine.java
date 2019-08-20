package homework04;

import java.util.Scanner;



public class Engine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Member member = null;
		Service service = new Service();
		while(true) {
			System.out.println("0.종료 1.Join 2.BMI, 3.ReportCard, 4.Tax 5.회원정보 확인 6.아이디찾기");
			switch(scan.nextInt()) {
			
			case 0 : System.out.println("종료");return;
			case 1 : 
				member = new Member();
				System.out.println("회원가입");
				System.out.println("아이디를 입력해주세요");
				member.setId(scan.next());
				System.out.println("비밀번호를 입력해주세요");
				member.setPassword(scan.next());
				System.out.println("이름을 입력해주세요");
				member.setName(scan.next());
				System.out.println("생년월일을 입력해주세요");
				member.setSsn(scan.next());
				System.out.println("키를 입력해주세요");
				member.setHeight(scan.nextDouble());
				System.out.println("몸무게를 입력해주세요");
				member.setWeight(scan.nextDouble());
				System.out.println("혈액형을 입력해주세요");
				member.setBlood(scan.next());
				System.out.println("연봉을 입력해주세요");
				member.setMoney(scan.nextInt());
				System.out.println("국어점수를 입력해주세요");
				member.setKor(scan.nextInt());
				System.out.println("영어점수를 입력해주세요");
				member.setEng(scan.nextInt());
				System.out.println("수학점수를 입력해주세요");
				member.setMath(scan.nextInt());
				
				break;
			case 2 : 
					System.out.println("BMI");
					System.out.println(service.getBmi(member));
					break;
			case 3 :
					System.out.println("성적계산");
					System.out.println(service.getReportCard(member));
					break;
			case 4 :
					System.out.println("세금계산");
					System.out.println(service.getTax(member));
					break;
			case 5 : 
				System.out.println("회원정보 확인");
				System.out.println(member.toString());
				break;
			case 6 :
				System.out.println("이름 , 생년월일을 입력하면 아이디 알려줌");
				String searchName = scan.next();
				String searchId = scan.next();
				if(searchName.equals("a") &&
						searchId.equals("a")) {
					System.out.printf("이름:%s"
							+"주민번호 : %s", member.getName(), member.getSsn());
				}else {
					System.out.println(member.getId());
				}
				break;
			
			}
		}
	}

}
