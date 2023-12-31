package abstraction;

/*
 *  추상화
 *  	
 *  	정의: 구현부가 없는 메소드를 정의하는 것
 *  	조건: 추상클래스나 인터페이스를 이용해서 추상 메소드를 정의한다 
 *  		 (추상클래스나 인터페이스는 추상메소드를 보유할 수 있다)
 *  		 구현클래스는 추상메소드를 보유할 수 없다 <--- 메소드를 재정의 강제
 *  	목적: 같은 부모클래스(추상클래스 혹은 인터페이스)를 상속받은 구현클래스는
 *  		 사용법이 동일하게 한다
 *  
 *  추상메소드와 추상클래스
 *    추상메소드
 *  	정의: 구현부가 없는 메소드다
 *  	조건: 메소드의 선언부에 abstract 키워드가 추가된다
 *  	목적: 자식 클래스에서 이 추상메소드를 재정의하게 한다
 *    
 *    추상클래스
 *    	정의: 추상 메소드를 보유할 수 있는 클래스다
 *    	조건: 클래스의 선언부에 abstract 키워드가 추가된다
 *  	목적: 추상메소드를 보유하는 것이다
 *  		 추상클래스를 상속받은 하위클래스가 추상메소드를 재정의 하도록한다
 *  	특징: 멤버변수, 멤버메소드, 정적변수, 정적메소드, 생성자, 추상메소드를 모두 보유할 수 있다
 *  		 new 연산자를 이용해서 객체 생성할 수 없다
 *  		인터페이스는 다른 인터페이스에게 상속받을 수 있다
 *  		인터페이스끼리는 다중 상속이 가능하다
 *  		인터페이스 타입의 참조변수로 객체를 참조할 수 있다
 *  	
 *  	인터페이스
 *  	- 표준, 규약, 스펙의 역할을 수행하는것이다
 *  	- 인터베이스는 상수와 추상메소드를 포함한다 (jave8부터는 정적메소드, 디폴트메소드도 가능)
 *		- 인터페이스는 구현클래가스가 반드시 구현할 기능의 명세를 정한다
 *	
 *	인터페이스의 형식
 *		public interface 인터페이스명 {
 *	// 인터페이스에서는 추상메소드에 abstract 키워드를 생략할 수 있다
 *			반환타입 메수드명(매개변수,매개변수);	
 *			반환타입 메수드명(매개변수,매개변수);	
 *			반환타입 메수드명(매개변수,매개변수);	
 *			반환타입 메수드명(매개변수,매개변수);	
 	}
 	
 	인터페이스를 구현한 구현클래스 정의하기
 		- 구현클래스는 하나 이상의 인터페이스를 구현할 수 있다
 		- 구현클래스느 인터페이스의 모든 추상 메소드를 재정의해야한다
 		- 같은 인터페이스를 구현한 구현클래스들은 사용법이 동일한 구현클래사다
 		
 		public class 구현클래스명 implements 인터페이스명,인터페이스명(여러개 구현가능) {
 		
 		}
 * 
 */




// 추상 클래스 정의하기 
// 추상 클래스는 추상메소드, 
public abstract class Chart { 

	// 추상 메소드 정의하기
	// 구현부가 없는 메소드
	public abstract void draw(); 
}
