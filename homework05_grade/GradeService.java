package homework05_grade;

public class GradeService {
	public String getTotal(Grade grade) {
		String total = "";
		
		int kor = grade.getKor();
		int eng = grade.getEng();
		int math = grade.getMath();
		
		int sum = kor + eng + math;
		
		total = String.format("%d", sum);
		
		
		return total;
	}
	public String getAvg(Grade grade) {
		String avg = "";
		
		int kor = grade.getKor();
		int eng = grade.getEng();
		int math = grade.getMath();
		
		int avg2 = (kor + eng + math) / 3;
		
		
		avg = String.format("%d",avg2);
		
		return avg;
	}
}
