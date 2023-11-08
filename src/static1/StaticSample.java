package static1;

public class StaticSample {

	int x; 
	static int y;
	
	public void m1() {
		// 멤버 메소드에서는 멤버변수, 정적변수를 사용할 수 있다
		x = 10;
		y = 20;
	}
	
	public void m2 () {
		// 멤버 메소드에서는 멤버메소드, 정적메소드를 사용 할 수 있다
		m1();
		StaticSample.m3();
	}
	
	public static void m3 () {
		// 정적메소드에서는 멤버변수를 사용할 수 없다
	//	x = 10; <--- 오류
		// 정적 메소드에서는 정적 변수를 사용할 수 있다
		y = 20;
		
	}
	
	public static void m4 () {
		// 정적메소드에서는 멤버 메소드를 사용할 수 없다
		// m1(); <ㅡ-- 오류
		// 정적 메소드에서는 정적메소드를 사용할 수 있다
		StaticSample.m3();
	} 
	
}
