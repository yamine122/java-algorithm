package study01;

import java.util.Date;
import java.text.SimpleDateFormat;
public class MonthEx {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String flag = sdf.format(date);
		String month = "";
		month = flag.substring(6,7);
		System.out.println(flag);
		int imonth = Integer.parseInt(month);
		switch(imonth) {
		case 1 : month = "1월"; break;
		case 2 : month = "2월"; break;
		case 3 : month = "3월"; break;
		case 4 : month = "4월"; break;
		case 5 : month = "5월"; break;
		case 6 : month = "6월"; break;
		case 7 : month = "7월"; break;
		case 8 : month = "8월"; break;
		case 9 : month = "9월"; break;
		case 10 : month = "10월"; break;
		case 11 : month = "11월"; break;
		case 12 : month = "12월"; break;
		default : break;
		}
		System.out.println(month);
	}

}
