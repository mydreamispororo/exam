package operator;

public class LogicalOpt_Ex {

	public static void main(String[] args) {
		//논리연산자 + if
		//c1 대문자인지 소문자인지 확인하여 출력		
		char c1 = 'A';
		char c2 = 'a';
		System.out.println((int)c1); //대문자 65
		System.out.println((int)c2); //소문자 97
		
		if((c1 >= 65) && (c1 <= 90)) {
			System.out.println("대문자입니다.");
		}else {
			System.out.println("소문자입니다.");
		}
		
		//변수 x가 2의 배수 또는 3의 배수인지를 확인하시오.
		//% 2 == 0 || % 3 == 0
		int x = 6;
		if((x % 2 == 0) || (x % 3 == 0)) {
			System.out.println("2의 배수 또는 3의 배수 입니다.");
						
		}else {
			System.out.println("2의 배수 또는 3의 배수가 아닙니다.");
	}
}
}
