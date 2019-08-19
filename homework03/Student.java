package homework03;

public class Student {
	public void getArithmeticCalculator() {}
	public String getBMI(String name , int weight , int height, double bmi , String s) {
		String result = "";
		bmi = weight / (height*0.01 * height*0.01);
		if(bmi > 30.0) {
			 s = "고도비만";
		}else if(bmi > 25.0) {
			s = "비만";
		}else if(bmi > 23.0) {
			s = "과체중";
		}else if(bmi > 18.5) {
			s = "정상";
		}else {
			s = "저체중";
		}
		System.out.printf("BMI지수 : %.1f, %s 입니다", bmi , s);
		return result;
	}
		public void getHowMuch() {
			
		}
		public String getJoin(String id , int password , String name , int adult , double height2, double weight2 , String type) {
			String result = "";
			System.out.println("=====회원정보=====");
			System.out.println("아이디 :" +id);
			System.out.println("비밀번호 :" +password);
			System.out.println("이름 :" +name);
			if(adult == 1) {
				System.out.println("성인여부 :성인입니다.");
			}else if(adult == 2) {
				System.out.println("성인여부 :미성년입니다.");
			}
			System.out.println("키 :"+height2+"cm");
			System.out.println("몸무게:"+weight2+"kg");
			System.out.println("혈액형 :"+type+"형");
			return result;
		}
		public String getLeapYear(int year) {
			String result="";
			String uyear = "";
			if(year % 4 == 0) {
				uyear = "윤년입니다.";
				if(year % 100 == 0) {
					uyear = "평년입니다.";
					if(year % 400 == 0) {
						uyear = "윤년입니다.";
					}
				}
			}else {
				uyear = "평년입니다";
			}
			System.out.println(uyear);
			return result;
		}
		public String getMonthEndDay(int month){
			String result = "";
			switch(month) {
			case 1 : 
			case 3 : 
			case 5 :
			case 7 :
			case 8 : 
			case 10 : 
			case 12 :
				System.out.println(month+ "월은 31일까지입니다.");
				break;
			case 4 : 
			case 6 :
			case 9 :
			case 11 :
				System.out.println(month+ "월은 30일까지입니다.");
				break;
			default : 
				System.out.println(month+ "월은 29일까지입니다.");
				break;
				
			}
			return result;
		}
		public String getReportCard(String name ,int kor , int eng , int math) {
			String result = "";
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
			return result;
		}
	}
