package homework04;

public class Service {
	public String getBmi(Member member) {
		String result = "";
		String s = "";
		double weight = member.getWeight();
		double height = member.getHeight();
		String name = member.getName();
		
		double bmi = weight / (height*0.01*height*0.01);
		if(bmi > 30.0) {
			s = "고도비만";
		}else if(bmi > 25.0) {
			s= "비만";
		}else if(bmi > 23.0) {
			s = "과체중";
		}else if(bmi > 18.5) {
			s = "정상";
		}else {
			s="저체중";
		}
		result = String.format("BMI지수 :%s님의  BMI는 %s 입니다" , name, s);
		return result;
	}
	
	public String getReportCard(Member member) {
		String result = "";
		String record = "";
		String name = member.getName();
		int kor = member.getKor();
		int eng = member.getEng();
		int math = member.getMath();
		int sum = kor+eng+math;
		int avg = sum / 3;
		if(avg >= 90) {
			record = "장학생";
		}else if(avg >= 70) {
			record = "합격";
		}else if(avg < 70) {
			record = "불합격";
		}
		
		result = String.format("학생 국어 영어 수학 합계 평균 합격여부\n"
				+"=========================================\n"
				+ "%s %d %d %d %d %d %s",name,kor,eng,math,sum,avg,record);
		return result;
	}
	public String getTax(Member member) {
		String result = "";
		String name = member.getName();
		int money = member.getMoney();
		double rate = 9.7;
		double tax = money / rate;
		result  = String.format("%s의 세금은 %.1f원입니다", name,tax);
		
		return result;
	}
}
