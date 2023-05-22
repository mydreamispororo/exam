package object;

import object.domain.Car4;

public class Car4_Ex {

	public static void main(String[] args) {
		Car4 c4 = new Car4();
		
//		c4.setSpeed(100);
//		System.out.println("현재 속도는 " + c4.getSpeed() + "Km/h 입니다.");
//		
//		c4.setSpeed(-100);
//		if(c4.getSpeed() == 0) {
//		System.out.println("현재 속도값을 잘 못 입력하였습니다.");
//		}
		c4.setStart(false);
		
		if(!c4.isStart()) {//멈췄으면..
			System.out.println("현재 속도는 " + c4.getSpeed() + "Km/h 입니다.");
		}
	}
}
