package homework05_member;

public class MemberService {
	public String getBmi(Member member) {
		String result = "";
		String s = "";
		double height = member.getHeight();
		double weight = member.getWeight();
		String name = member.getName();
		
		double bmi = weight / (height*0.01)*(height*0.01);
		
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
		
		result = String.format("%s %s",name , s);
		
		return result;
	}
	public String getTax(Member member) {
		String result = "";
		
		int money = member.getMoney();
		double rate = 9.7;
		double tax = money / 9.7;
		
		result = String.format("%.1f", tax);
		
		
		return result;
	}

}
