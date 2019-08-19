package homework03;

import java.util.Scanner;
public class Engine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student student = new Student();
		while(true) {
			System.out.println("0.종료 1.ArithmeticCalculator 2.BMI 3.HowMuch 4.Join 5.LeapYear "
					+ "6.MonthEndDay 7.Ranking 8.ReportCard 9.ScoreCalc 10.Tax 11.TimeCalc");
			switch(scan.nextInt()){
			case 0 : System.out.println("종료"); return;
			case 1 : break;
			case 2 : System.out.println("BMI 이름 몸무게 키를 입력하시오");
					String name = scan.next();
					int weight = scan.nextInt();
					int height = scan.nextInt();
					String s = "";
					double bmi = 0.0;
					String result = student.getBMI(name, weight, height, bmi, s);
					System.out.println(result);
				break;
			case 3 : break;
			case 4 : System.out.println("회원가입");
					 System.out.println("id 비밀번호 이름 성인이면1번미성년이면2번 키 몸무게 혈액형을 입력해주세요");
					 String id = scan.next();
					 int password = scan.nextInt();
					 name = scan.next();
					 int adult = scan.nextInt();
					 double height2 = scan.nextDouble();
					 double weight2 = scan.nextDouble();
					 String type = scan.next();
					 result = student.getJoin(id, password, name, adult, height2, weight2, type);
					 System.out.println(result);
				break;
			case 5 : 
					 System.out.println("연도를 입력하세요");
					 int year = scan.nextInt();
					 result = student.getLeapYear(year);
					 System.out.println(result);
					 break;
			case 6 : 
					 System.out.println("월을 입력해주세요");
					 int month = scan.nextInt();
					 result = student.getMonthEndDay(month);
					 System.out.println(result);
					 break;
			case 7 : 
				
				     break;
			case 8 : System.out.println("학생의 이름을 입력하세요");
					 name = scan.next();
					 System.out.println("학생의 국어점수를 입력하세요");
					 int kor = scan.nextInt();
					 System.out.println("학생의 영어점수를 입력하세요");
					 int eng = scan.nextInt();
					 System.out.println("학생의 수학 점수를 입력하세요");
					 int math = scan.nextInt();
					 result = student.getReportCard(name, kor, eng, math);
					 System.out.println(result);
				     break;
			case 9 : break;
			case 10 : break;
			case 11 : break;
			}
		}

	}

}
