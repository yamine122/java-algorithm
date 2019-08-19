package study02;

public class Sum1to5 {

	public static void main(String[] args) {
		//1 + 2 + 3 + 4 + 5 = 
		String eval = "";
		for(int i = 1; i <= 5; i++) {
			/**
			if(i == 5) {
				eval += i+" = ";
				}else {
					eval += i+" + ";
					}
			*/
			eval += (i==5) ? i + " = " : i + " + ";
			
		}
		System.out.println(eval);
		}

}
