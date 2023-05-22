package variable;

public class Boolean_Ex {

	public static void main(String[] args) {
		//(만약에) true 출발, false 정지하는 프로그램으로 작성하시오.
		boolean run = false;
		if(run) { //run == true; 이렇게 작성안함
			System.out.println("자동차가 출발");
		}else {
			System.out.println("자동차가 정지");
		}
		
		//결과가 true, false : a == b, a != b
		int num1 = 5;
		boolean r1 = num1 == 10;
		System.out.println(r1);
		System.out.println(num1 == 10);
		System.out.println(num1 != 10);
		
		System.out.println(num1 == 10 ? true : false);
		
	}

}
