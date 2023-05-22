package object;

import object.domain.Computer;

public class Computer_Ex {

	public static void main(String[] args) {
		Computer c = new Computer();
		
		c.powerOn("windows");
		
		System.out.println(c.add(100, 200));
		System.out.println(c.mul(100, 200));
		
		c.powerOff("windows");
	}

}
