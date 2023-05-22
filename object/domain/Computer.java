package object.domain;

public class Computer {
	//메소드(동작)
	//전원on
	public void powerOn(String name) {
		System.out.println(name + "전원을 켭니다.");
	}
	
	//전원off
	public void powerOff(String name) {
		System.out.println(name + "전원을 끕니다.");
	}
	
	//더하기
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	//곱하기
	public int mul(int num1, int num2) {
		return num1 * num2;
	}
	

}
