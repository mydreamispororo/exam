package object;

import object.domain.Car3;

public class Car3_Ex {

	public static void main(String[] args) {
		Car3 c3 = new Car3("그랜저", 400, true);
		
		System.out.println(c3.model);
		System.out.println(c3.speed);
		System.out.println(c3.start);
	}

}
