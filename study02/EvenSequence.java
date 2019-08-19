package study02;

import java.util.Scanner;

public class EvenSequence {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String seq = "";
		int series = 0;
		System.out.println("시작값:");
		int start = scan.nextInt();
		System.out.println("마지막값:");
		int end = scan.nextInt();
		for(int i = start; i <= end; i++) {
			if(i % 2 != 1) {
			   if(i != end) {
					seq += i + " + ";
			}else if(i == end){
				seq += i + " = ";
			}
			series += i;
		}
		}
		System.out.println(seq+series);
	}
}


