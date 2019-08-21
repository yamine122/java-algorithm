package homework05_member;

import javax.swing.JOptionPane;



public class MemberController {

	public static void main(String[] args) {
		Member member = null;
		MemberService service = new MemberService();
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 1.회원가입 2.정보보기 3.BMI 4.TAX")) {
			
			case "0" : return;
			case "1" : 
			 	
				member = new Member();
	
				member.setId(JOptionPane.showInputDialog("아이디입력"));
				member.setPassword(JOptionPane.showInputDialog("비밀번호"));
				member.setName(JOptionPane.showInputDialog("이름"));
				member.setSsn(JOptionPane.showInputDialog("생년월일"));
				member.setBlood(JOptionPane.showInputDialog("혈액형"));
				member.setHeight(Double.parseDouble(JOptionPane.showInputDialog("키")));
				member.setWeight(Double.parseDouble(JOptionPane.showInputDialog("몸무게")));
				member.setMoney(Integer.parseInt(JOptionPane.showInputDialog("연봉")));
				
				break;
			case "2" :
						JOptionPane.showMessageDialog(null, member.toString());
						break;
				
			case "3" : 
				
						JOptionPane.showMessageDialog(null, service.getBmi(member));
						
						break;
				
			case "4" : JOptionPane.showMessageDialog(null, service.getTax(member));
					
						break;
				
			}
		}

	}

}
