package homework02;

import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.Equals;

/**To. 개발자님
프로그램을 하나 개발해야 합니다.
교수가 요청하기를 브라우저에서 사용할 계산기를 만들어 달랍니다.
복잡할 필요는 없고, 사칙연산 가능하고 나눗셈은
몫과 나머지값으로 출력하면 된답니다.
출력결과물은 예를 들어
5 + 5 = 10
2 - 7 = -5
이렇게 되고,
10 / 3 = 3 [1] 나눗셈은 이렇게 나오면 된답니다.
그러면 []값이 나머지인지는 교수가 이미 알고 있겠답니다.
*/
public class ArithmeticCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0, b = 0, c = 0 , d = 0;
		System.out.println("첫번째 수를 입력하세요");
		a = scan.nextInt();
		System.out.println("두번째 수를 입력하세요");
		b = scan.nextInt();
		System.out.println("+ , - , * , /를 입력하시오");
		String op = scan.next();
		if(op.equals("+")) {
			c = a + b;
			System.out.println(c);
		}else if(op.equals("-")) {
			c = a - b;
			System.out.println(c);
		}else if(op.equals("*")) {
			c = a * b;
			System.out.println(c);
		}else if(op.equals("/")) {
			c = a / b;
			d = a % b;
			System.out.println(c+" " +"["+d+"]");
		}

	}

}
