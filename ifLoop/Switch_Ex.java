package ifLoop;

public class Switch_Ex {

	public static void main(String[] args) {
		//임이의 수 = 난수 = random
		//Math.random() -> 실수(0) -> 형변환 * 6 -> +1
		//주사위 : 1 ~ 6
//		System.out.println((int)(Math.random() * 6)+ 1);
		int random = (int)(Math.random() * 3)+ 1;
//		1이면 "가위" 2이면 "바위" 3이면 "보"
		
		if(random == 1) {
			System.out.println("가위");
		}else if(random == 2) {
			System.out.println("바위");
		}else if(random == 3) {
			System.out.println("보");
		}
		
		System.out.println("-----------------------------------------");
		
		switch(random) {
		
		case 1:
			System.out.println("가위");
			break;
			
		case 2:
			System.out.println("바위");
			break;
			
		case 3:
			System.out.println("보");
			break;
		}
		System.out.println("-----------------------------------------");
		
		//A a, B b, C c
		//switch
		char grade = 'a';
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("A 등급입니다.");
			break;
			
		case 'B':
		case 'b':
			System.out.println("B 등급입니다.");
			break;
			
		case 'C':
		case 'c':
			System.out.println("C 등급입니다.");
			break;
			
		}
		
		
		

	}

}
