package study03;

import java.util.Scanner;
import study03.Student;
public class Engine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student std = new Student();
		int flag = 0;
		while(true) {
			System.out.println("메뉴 : 0.종료  1.BMI 2.Ranking 3. HowMuch 4.ReportCard");
			flag = scan.nextInt();
			switch(flag) {
			case 0 : System.out.println("종료");
			return;
			case 1 :
			System.out.println("1.BMI");
			System.out.println("이름을 입력하세요");
			String name = scan.next();
			System.out.println("몸무게를 입력하세요");
			double weight = scan.nextDouble();
			System.out.println("키를 입력하세요");
			double height = scan.nextDouble();
			std.getBmi(name, weight, height);
			break;
			case 2 : System.out.println("Ranking"); 
			std.getRank();
			break;
			case 3 : System.out.println("HowMuch");
			std.HowMuch();
			break;
			case 4 : System.out.println("ReportCard");
			std.getReportCard();
			break;
			
			}
		}

	}

}
