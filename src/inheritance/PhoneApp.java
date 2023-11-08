package inheritance;

public class PhoneApp {

	public static void main(String[] args) {
		
		// phone 객체 생성하기
		Phone p1 = new Phone();
		p1.number = "010 - 1234 -1234";
		p1.call();
		p1.receive();
		
		// smartphone 객체 생성하기
		SmartPhone p2 = new SmartPhone();
		p2.number = "010 -2222- 3333";
		p2.ip = "192.169.01.11";
		p2.call();
		p2.receive();
		p2.internet();
		p2.game();
		
	}
}
