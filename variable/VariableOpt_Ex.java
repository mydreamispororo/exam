package variable;

public class VariableOpt_Ex {

	public static void main(String[] args) {
		//글자와 글자, 글자와 변수, 변수와 글자를 연결할 때 : +부호
		//cf) 숫자 + 숫자 = 합
		//연산자 우선순위
		
		int hour = 9;
		int minutes = 38; //9시 31분 입니다.
		
		System.out.println(hour + "시 " + minutes + "분 입니다.");
		System.out.println(hour + minutes);
		
		//전체를 분으로 표시하시오. 100분
		int result = (hour * 60) + minutes;
		System.out.println(result + "분");
		
		

	}

}
