package ifLoop;

import java.util.Scanner;

public class WhileSwitch_Ex {

	public static void main(String[] args) {
		
		//Scanner를 이용해서 메뉴를 입력받기

		//합계를 저장할 변수를 하나 만들고
		//I 또는 i 를 선택하면 합계 변수의 값을 1 더하기
		//M 또는 m 를 선택하면 합계 변수의 값을 1 빼기
		//Q 또는 q 를 입력하면 프로그램 종료
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int sum = 0;
		
		while(run) {
			System.out.println("----------------------------");
			System.out.println("I. 더하기     M. 빼기     Q. 프로그램 종료");
			System.out.println("----------------------------");
			
		
		System.out.print("메뉴를 입력해 주세요 >> ");
		String menu = sc.next();
		
		switch(menu) {
		
		case "I":
		case "i":
			++sum;
			System.out.println("현재 합계는 " + sum);
			System.out.println();
			break;
			
		case "M":
		case "m":
			--sum;
			System.out.println("현재 합계는 " + sum);
			System.out.println();
			break;
			
		case "Q":
		case "q":
			System.out.println("1을 더합니다.");
			System.out.println();
			break;
			
		default:
			System.out.println("프로그램이 종료됩니다.");
			System.exit(0);
			
		}
	}
	}

}
