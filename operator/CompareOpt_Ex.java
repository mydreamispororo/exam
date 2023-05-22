package operator;

public class CompareOpt_Ex {

	public static void main(String[] args) {
		//대소비교 : true, false
		int num1 = 10;
		int num2 = 5;
		System.out.println(num1 >= num2);
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		
		//char 비교 : 문자, 숫자 : 대소비교 가능
		char c1 = 'A';
		char c2 = 'B';
		System.out.println(c1 > c2);
		
		//정수와 실수 비교
		int i = 10;
		double d = 10.0;
		System.out.println(i == d);
		
		//문자열 비교
		String str1 = "부산";
		String str2 = "코리아아이티";
		System.out.println(str1.equals(str2)); // 값이 일치
		System.out.println(!str1.equals(str2));
	}
}
