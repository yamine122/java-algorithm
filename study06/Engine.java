package study06;
import javax.swing.JOptionPane;


public class Engine {
	
	public static void main(String[] args) {
		
		Member member = null;
		Service service = new Service();
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 1.회원가입 2.정보보기 3.아이디찾기 4.BMI")) {
			case "0" : System.out.println("종료");return;
			case "1" : 
			 	
				member = new Member();
	
				member.setId(JOptionPane.showInputDialog("아이디입력"));
				member.setPassword(JOptionPane.showInputDialog("비밀번호"));
				member.setName(JOptionPane.showInputDialog("이름"));
				member.setSsn(JOptionPane.showInputDialog("생년월일"));
				member.setType(JOptionPane.showInputDialog("혈액형"));
				break;
			case "2" : 
				JOptionPane.showMessageDialog(null, "2.마이페이지\n" +service.toString());
				break;
			
			case "3" :
				System.out.println("아이디 , 이름을 입력하면 아이디 알려줌");
				//String searchName = scan.next();
				//String searchId = scan.next();
				//if(searchName.equals("a") &&
					//	searchId.equals("a")) {
					System.out.printf("찾는아이디:%s"
							+"주민번호 : %s", member.getId(), member.getSsn());
				}//else {
					System.out.println("찾는아이디가 없습니다.");
				}
				//break;
				
			
			
			}
		

	}


