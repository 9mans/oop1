package inner;

public class Sample2 {

	private int value1;
	static int value2;
	
	public void method1() {
		
	}
	
	public static void method2() {
		
	}
	/*
	 *  정적 내부 클래스
	 *   - 외부 클래스에 대한 객체 생성없이 사용할 수 있다
	 *   - 외부 클래스의 멤버변수 멤버 메소드에 접근할 수 없다
	 *     그래서 외부 클래스의 멤버변수와 직접 관련된 작업의 구현에 사용되기 보다는
	 *     외부 클래스와 독립적인 작업의 구현에 사용된다
	 */
	static class Inner2 {
	
		/*
		 *  정적 내부클래스에서는 외부 클래스의 정적 변수, 정적 메소드만 사용가능하다
		 */
		public void method() {
//			System.out.println(value1); 컴파일오류
			System.out.println(value2);
//			method1(); 컴파일오류
			method2();
		}
	}
}
