package inheritance;

public class PhoneApp2 {

	public static void main(String[] args) {
		
		// 클래스의 형변환 
		// 클래스가 상속 관계에 있을때 자식 객체를 부모 타입에 닮을 수 있다
		// 생성한 객체와 참조변수의 타입이 다를 때 발생
		// 실제 생성된 객체중에서 타입이 맞는 부모객체의 주소값을 바라본다
		// 어느 타입을 바라보고 있느냐에 따라 사용할 수 있는 기능이 달라진다
		
		// 클래스의 형변환은 객체의 종류를 제한 할 수 있다
		// 데이터타입을 보면 그 타입과 그 타입의 하위를 담을 수 있다는 것을 알자
		// 참조변수를 볼 때 클래스의 형변환을 항상 인지해야한다
		
		// iphone 객체는 iphone 타입이다
		Iphone p1 = new Iphone();
		p1.appleMusic();					//iphone
		p1.applePay();						//iphone
		p1.ip = "192.167.21.1";				//smartphone
		p1.internet();						//smartphone
		p1.game();							//smartphone
		p1.number = "010 - 2222 - 3333";	//phone
		p1.call();							//phone
		p1.receive();						//phone
		
		
		// iphone 객체는 smartphone 타입이다(상속)
		SmartPhone p2 = new Iphone();
		
//		p2.appleMusic();					//iphone
//		p2.applePay();						//iphone
		p2.ip = "192.167.21.1";				//smartphone
		p2.internet();						//smartphone
		p2.game();							//smartphone
		p2.number = "010 - 2222 - 3333";	//phone
		p2.call();							//phone
		p2.receive();						//phone
		
		
		// iphone 객체는 phone 타입니다 (상속)   
		Phone p3 = new Iphone();
		
		Iphone p4 = (Iphone)p3;
		
//		p3.appleMusic();					//iphone
//		p3.applePay();						//iphone
//		p3.ip = "192.167.21.1";				//smartphone
//		p3.internet();						//smartphone
//		p3.game();							//smartphone
		p3.number = "010 - 2222 - 3333";	//phone
		p3.call();							//phone
		p3.receive();						//phone
		
		// 데이터타입이 다를 때 옮겨가는 방법 p4
		p4.appleMusic();					//iphone
		p4.applePay();						//iphone
		p4.ip = "192.167.21.1";				//smartphone
		p4.internet();						//smartphone
		p4.game();							//smartphone
		p4.number = "010 - 2222 - 3333";	//phone
		p4.call();							//phone
		p4.receive();						//phone
	}
}
