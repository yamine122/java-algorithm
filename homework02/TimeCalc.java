package homework02;

import java.util.Scanner;

/**
To.개발자님께
초단위로 알려주는 시험이 있는데
이 값을 몇시간 몇분 몇초인지 계속 계산해야 해서요.
혹시 초값을 입력받으면 자동으로 계산되는 프로그램을 만들어 줄 수 있을까요?
그러니까 500초 이면 뭐 몇시간 몇분 몇초라고 보여주면 좋겠죠.
@author user
 */
public class TimeCalc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s2= 0;
		System.out.println("초를 입력하세요");
		s2 = scan.nextInt();
		
		System.out.println(s2/3600 +"시간" +s2%3600/60+"분"+s2%3600%60+"초");
		
		
	}

}
