package homework05_grade;
import javax.swing.JOptionPane;

public class GradeController {

	public static void main(String[] args) {
		
		Grade grade = null;
		GradeService service = new GradeService();
		
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 1.정보입력 2.합계 3.평균")) {
			
			
			case "0" : JOptionPane.showInputDialog("종료");
						return;
			case "1" : 
			grade = new Grade();
						grade.setKor(Integer.parseInt(JOptionPane.showInputDialog("국어점수 입력")));
						grade.setEng(Integer.parseInt(JOptionPane.showInputDialog("영어점수 입력")));
						grade.setMath(Integer.parseInt(JOptionPane.showInputDialog("수학점수 입력")));
						
						break;
						
			case "2" : 
						JOptionPane.showMessageDialog(null, service.getTotal(grade));
						break;
						
			case "3" : 
						JOptionPane.showMessageDialog(null, service.getAvg(grade));
						break;
			
			}
			
			
		
			
			
			
			
			
			
			
			}
		}
		
		
	}

