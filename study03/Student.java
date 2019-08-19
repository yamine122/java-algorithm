package study03;

import java.util.Scanner;

public class Student {
// 1. BMI 2. Ranking 3.HowMuch 4.ReportCard
	public String getBmi(String name, double weight, double height) {
		String eval = "";
		double bmi = weight / (height/100 * height/100);
		if(bmi > 30.0) {
			
			eval = "고도비만";
		}else if(bmi > 25.0) {
			eval = "비만";
		}else if(bmi > 23.0) {
			eval = "과체중";
		}else if(bmi > 18.5) {
			eval="정상";
		}else {
			eval="저체중";
			
			String result = String.format("%s님의 BMI수치는 %s입니다.\n", name, eval);
			
			
		}
	}
	public void getRank(double[] records) {
		Scanner scan = new Scanner(System.in);
		int numOfPlayer = 3;
		Scanner scan = new Scanner(System.in);
		double[] records = new double[numOfPlayer];
		String[] players = new String[] {"A" , "B" ,"C"};
		
		
		System.out.println("기록입력기");
		for(int i = 0 ;i < numOfPlayer; i++) {
			System.out.printf("%s 선수 기록>", players[i]);
			records[i] = scan.nextDouble();
						
		}
		//정렬
		for(int i = 0 ;i < numOfPlayer ; i++) {
			for(int j = 0 ;  j <numOfPlayer -1; j++ ) {
				if(records[j] > records[j+1] ) {
					double tempDB = records[j];
					records[j] = records[j+1];
					records[j+1] = tempDB;
					
					String tempST = players[j];
					players[j] = players[j+1];
					players[j+1] = tempST;
					
				}
			}
		}
		
		
		
		
		
		//출력
		for(int i = 0; i < numOfPlayer; i++) {
			System.out.printf("%d등: %s: 선수기록(%.1f) \n", i+1, players[i], records[i]   );
		}
		
		
	}
	public void HowMuch() {
		Scanner scan = new Scanner(System.in);
		System.out.println("얼마에요?");		
		int price = scan.nextInt();
		System.out.printf("%d원입니다.\n", price);
		System.out.println("몇개드릴까요");
		int num = scan.nextInt();
		System.out.println(num + "개 주세요");
		int total = 0;
		int total2 = 0;
		total = price * num ;
		int dc = total / 10;
		total2 = total - dc;
		System.out.println("총금액은" + total + "원 입니다.");
		System.out.println("비싸요 10%만 깍아주세요");
		System.out.println("그럼" + total2+"원만 주세요");
	}
	public void getReportCard() {
		Scanner scan = new Scanner(System.in);
		System.out.println("학생의 이름을 입력하세요");
		String name = scan.next();
		System.out.println("학생의 국어 점수를 입력하세요");
		int kor = scan.nextInt();
		System.out.println("학생의 영어 점수를 입력하세요");
		int eng = scan.nextInt();
		System.out.println("학생의 수학점수를 입력하세요");
		int math = scan.nextInt();
		int avg = 0, sum = 0;
		String record = "";
		sum = kor + eng + math;
		avg = sum / 3;
		if(avg >= 90) {
			record = "장학생";
		}else if(avg >= 70) {
			record = "합격";
		}else if(avg < 70) {
			record = "불합격";
		}
		System.out.println("학생	국어	영어	수학	총점	평균	합격여부");
		System.out.println("===================================================="); 
		System.out.println(name+"        "+kor+"       "+eng+"      "+math+"     "+sum+"    "+avg+"      "+record);
	}
}
