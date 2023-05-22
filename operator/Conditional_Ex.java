package operator;

public class Conditional_Ex {

	public static void main(String[] args) {
		//if, 삼항연산자를 이용하여 출력하시오.
		int score = 90;
		
		
		//점수가 90이상이면 A 아니면 B를 표시하시오
		if(score >= 90) {
			System.out.println("등급은 A 입니다.");
			
		}else {
			System.out.println("등급은 B 입니다.");
		}
		
		String str = (score >= 90) ? "A" : "B";
		System.out.println("당신의 등급은 " + str + "입니다.");
		System.out.println((score >= 90) ? "A" : "B");
			
		//점수가 90이상이면 A, 80이상이면 B 아니면 C를 표시하시오
		if(score >= 90) {
			System.out.println("등급은 A 입니다.");
			
		}else if(score >= 80){
			System.out.println("등급은 B 입니다.");
		}else {
			System.out.println("등급은 C 입니다.");
		}
		
		char c = (score >= 90) ? 'A' : (score >= 80) ? 'B' : 'C';
		System.out.println(c);
	}

}
