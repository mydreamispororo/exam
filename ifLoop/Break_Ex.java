package ifLoop;

public class Break_Ex {

	public static void main(String[] args) {
		//주사위 난수를 발생시켜서 3이 나오면 프로그램을 종료
		
		boolean run = true;
		while(run) {
			int dice = (int)(Math.random() * 6) + 1;
			
			System.out.println("주사위 숫자는 " + dice + "입니다.");
			
			if(dice == 3) {
				break; //바로 아래 반복문의 닫는 중괄호를 빠져 나감
			}
		}
		System.out.println("프로그램 종료");
		
		System.out.println("--------------------------------------------------------");
		
		//1 ~ 10 까지 홀수만 표시하시오.
		int sum = 0;
		for(int i = 0; i <= 10; ++i) {
			if(i % 2 == 0)
				continue; //조건을 만족하면 건너뛰기
			sum += i;
		}
		System.out.println(sum);
	}

}
