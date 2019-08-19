package study03;

import java.util.Random;

public class RandomOrder {

	public static void main(String[] args) {
		
		Random r = new Random();
		int team = 0;
		for(int i = 0; i < 6; i++) {
			team = r.nextInt(6)+1;
			System.out.println(team);
		}

	}

}
