package object.domain;

public class Car3 {
	//필드(생성자) 오버로딩
	public String model;
	public int speed;
	public boolean start;
	
	public Car3() {	}

	public Car3(String model) {
		this.model = model;
	}

	public Car3(String model, int speed) {
		this(model);//this.model = model;
		this.speed = speed;
	}

	public Car3(String model, int speed, boolean start) {
		this(model, speed);
		//this.model = model;
		//this.speed = speed;
		this.start = start;
	}
}
