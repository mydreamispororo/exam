package object.domain;

public class Car4 {
	//필드 : private
	private int speed;
	private boolean start;
	
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			
		}else {
			this.speed = speed;
			
		}this.speed = speed;
	
	}
	public boolean isStart() {
		return start;
	}
	public void setStart(boolean start) {
		if(start == false) {//출발에 false = 멈춤
			this.speed = 0;
		}else {
		this.start = start;
	}
	
	}
	
	//getter setter
	
	//speed는 음수면 0으로 초기화
	//차량이 멈추면(start) speed는 0으로 초기화
	

}
