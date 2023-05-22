package variable;

import java.util.Scanner;

public class Scanner_Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
//		int x, y;
//		
//		//정수 x, y를 Scanner로 입력받아 더하는 프로그램
//		System.out.print("정수 x 입력 >");
//		x = sc.nextInt();
//		
//		System.out.print("정수 x 입력 >");
//		y = sc.nextInt();
//		
//		int result = x + y;
//		System.out.println("정수 x + y = " + result);
		
		//무한반복 프로그램을 작성하시오. 단, q를 입력받으면 프로그램 종료(break)
		//switch -> q => 종료
		//break, contunue 반복문
		
		boolean run = true;
		while (run) {
			System.out.print("메뉴 선택 > ");
			String word = sc.next();
			
			if(word.equals("q") || word.equals("Q")) {
				//if 구문 만나기 전까지 무한 반복
				//break를 만나면 while 문을 빠져 나감(반복문을 빠져나감)
				break;
			}
			
			System.out.println("입력한 문자 : " + word);
			
		} //break를 만나면 빠져 나오는 구문
		
		System.out.println("프로그램 종료");

	}

}










