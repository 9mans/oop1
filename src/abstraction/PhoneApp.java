package abstraction;

public class PhoneApp {

	public static void main(String[] args) {
		// 인터페이스도 부모취급
		
		// NormalPhone 타입의 참조변수는 NormalPhone 객체를 참조할 수 있다
		NormalPhone p1 = new NormalPhone();
		
		// Phone 타입의 참조변수는 NormalPhone 객체를 참조할 수 있따
		Phone p2 = new NormalPhone();

		// Iphone 타입의 참조변수는 Iphone객체를 참조할 수 있다
		Iphone p3 = new Iphone();
		
		// SmartPhone 타입의 참조변수는 Iphone 객체를 참조할 수 있다
		SmartPhone p4 = new Iphone();
		
		// Phone 타입의 참조변수는 Iphone 객체를 참조할 수 있다
		Phone p5 = new Iphone();
		
		p4.game();
		p4.internet();
//		p4.call("010-2222-3333");	
//		p4.receive();
//		p4.sms("010- 2222-2222" , "안녕하세요");

//		p5.game();
//		p5.internet(); 
		p5.call("010-2222-3333");
		p5.receive();
		p5.sms("010- 2222-2222" , "안녕하세요");
	}
}


/*
 * 객체를 획득하는 방법
 * 
 * 
 * 1.
 * public class me {
 * 
 * 		// 의존하는 객체를 직접 생성해서 멤버변수에 대입한다
 * 		Phone phone = new IPhone();
 * }
 *
 * 
 * 2.
 * public class Me {
 * 		Phone phone;
 * 
 * 		public Me(Phone phone) {
 * 			this.phone = phone;
 * 		}
 * }
 * 
 * public class Wife {
 * 		public static void main(String[] args) {
 * 			
 * 			Iphone p = new Iphone();
 * 			// Me가 사용할 전화기객체를 생성해서 Me에게 조립했다
 * 			Me me = new Me(p)
 * 		}  (의존성주입)
 * }
 * 
*/
