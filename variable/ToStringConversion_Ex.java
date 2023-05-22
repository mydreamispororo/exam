package variable;

public class ToStringConversion_Ex {

	public static void main(String[] args) {
		String str = "1234";
		int num2 = Integer.parseInt(str);
		
		int num1 = 100;
		System.out.println(str + num1);
		System.out.println(num2 + num1);
	
		//숫자 -> 문자열
		int var1 = 100;
		int var2 = 200;
		System.out.println(var1 + var2);
		System.out.println(var1 + String.valueOf(var2));
	}

}
