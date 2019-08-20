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
		result = String.format("BMI지수 : %.1f, %s 입니다", bmi , s);
		return result;
	}
		public void getHowMuch() {
			
		}
		public String getJoin(String id , int password , String name , int adult , int height2, int weight2 , String type) {
			String result = "";
			/*System.out.println("=====회원정보=====");
			System.out.println("아이디 :" +id);
			System.out.println("비밀번호 :" +password);
			System.out.println("이름 :" +name);*/
			result = String.format("아이디 :%s\n 비밀번호 : %d\n 이름 : %s\n 성인여부 %d 키 : %d 몸무게 : %d\n 혈액형 : %s\n" , id , password , name , adult , height2 , weight2 , type);
			if(adult == 1) {
				//System.out.println("성인여부 :성인입니다.");
			}else if(adult == 2) {
				//System.out.println("성인여부 :미성년입니다.");
			}
			//System.out.println("키 :"+height2+"cm");
			//System.out.println("몸무게:"+weight2+"kg");
			//System.out.println("혈액형 :"+type+"형");
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
			result = String.format("%s", uyear);
			return result;
		}
		public String getMonthEndDay(int month, int day){
			String result = "";
			switch(month) {
			case 1 : 
			case 3 : 
			case 5 :
			case 7 :
			case 8 : 
			case 10 : 
			case 12 :
				//System.out.println(month+ "월은 31일까지입니다.");
				day = 31;
				break;
			case 4 : 
			case 6 :
			case 9 :
			case 11 :
				//System.out.println(month+ "월은 30일까지입니다.");
				day = 30;
				break;
			default : 
				//System.out.println(month+ "월은 29일까지입니다.");
				day = 29;
				break;
				
			}
			result = String.format("%s 월은  %d까지 입니다", month, day);
			return result;
		}
		public String getRank() {
			String result = "";
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
			result = String.format("학생 국어 영어 수학 합계 평균 합격여부"
								  +"%s %d %d %d %f %f %s" , name ,kor,eng,math,sum,avg,record);
			return result;
		}
		public String getScoreCalc() {
			String result = "";
			return result;
		}
		public String getTax(String name , int money, double rate) {
			String result = "";
			System.out.println("연봉"+money/10000+"만원을 받으시는"+name+"님께서 납부할 세금은"+Math.round(money/rate)/10000+"만원입니다");
			return result;
		}
		public String getTimeCalc(int s2) {
			String result = "";
			System.out.println(s2/3600 +"시간" +s2%3600/60+"분"+s2%3600%60+"초");
			return result;
		}
	}
