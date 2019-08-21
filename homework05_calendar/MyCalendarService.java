package homework05_calendar;

public class MyCalendarService {
	public String getEndDay(MyCalendar mc) {
		String endDay = "";
		String m = "";
		int month = mc.getMonth();
		
		switch(month) {
		case 1 : 
		case 3 : 
		case 5 :
		case 7 :
		case 8 : 
		case 10 : 
		case 12 :
			
				m = "31일";
			
			break;
		case 4 : 
		case 6 :
		case 9 :
		case 11 :
			   m = "30일";
			break;
		default : 
			   m = "29일";
			break;
		}
		
		endDay = String.format("%s", m);
		
		return endDay;
	
}
	public String isLeapYear(MyCalendar mc) {
		String leapYear ="";
		
		int year = mc.getYear();
		
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
		leapYear = String.format("%s", uyear);
		
		return leapYear;
	}
}
