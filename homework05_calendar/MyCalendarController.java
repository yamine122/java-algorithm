package homework05_calendar;
import javax.swing.JOptionPane;

public class MyCalendarController {

	public static void main(String[] args) {
		MyCalendar mc = null;
		MyCalendarService service = new MyCalendarService();
		
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 1.날짜입력 2.월구하기 3.윤년")) {
			
			case "0" : JOptionPane.showMessageDialog(null, "종료");
						return;
			case "1" : 
						mc = new MyCalendar();
						mc.setMonth(Integer.parseInt(JOptionPane.showInputDialog("월을입력하세요")));
						mc.setYear(Integer.parseInt(JOptionPane.showInputDialog("년도를입력하세요")));
						break;
						
			case "2" : JOptionPane.showMessageDialog(null, service.getEndDay(mc));
						break;
						
			case "3" : JOptionPane.showMessageDialog(null, service.isLeapYear(mc));
						break;
			
			}
		}
	}

}
