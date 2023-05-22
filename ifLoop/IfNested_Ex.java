package ifLoop;

public class IfNested_Ex {

	public static void main(String[] args) {
		//if ~ if ~ if
		//90이상인 점수 중에서 95이상이면 A+, 90이상이면 A
		//80이상인 점수 중에서 85이상이면 B+, 80이상이면 B
		//나머지는 F로 표시
		
		int score = 98;
		
		if(score >= 90) {
			if(score >= 95) {
				System.out.println("A+학점");
			}else {
				System.out.println("A학점");
			}
			
		}else if(score >= 80) {
			if(score >= 85) {
				System.out.println("B+학점");
			}else {
				System.out.println("B학점");
			}
			
		}else {
			System.out.println("F학점");
		}
	}
}
