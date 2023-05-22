package variable;

public class TypeCasting_Ex {

	public static void main(String[] args) {
		//Type Casting = 형변환
		//특별히 타입 표시를 하지 않으면 정수는 int, 실수 double
		
		//byte < char < int < float < double
		//int -> byte
		int var = 300;
		byte b = (byte)var;
		System.out.println(b); //부정확한 값이 출력
		
		System.out.println();
		
		//int -> char(문자도 되고 숫자도 되고)
		int i = 64;
		char c = (char)i; //int 숫자를 매칭해서 ASCII 코드 변환
						  //UTF-8 : 3byte - 모든 언어를 지원할 때 쓰는 포맷
		
		System.out.println(c);
		
		//double -> int
		double PI = 3.14;
		int result = (int)PI;
		System.out.println(result);
	}

}
