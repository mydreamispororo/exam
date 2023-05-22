package object;

import object.domain.Car2;

public class CarField_Ex {

	public static void main(String[] args) {
		//자동차 객체를 생성해서 필드에 모델명, 시동, 속도를 표시하는 프로그램 완성하시오.
		Car2 c2 = new Car2();
		c2.model = "아반떼";
		c2.speed = 240;
		c2.start = false;
		
		System.out.println(c2.model);
		System.out.println(c2.speed);
		System.out.println(!c2.start);
	}
}
