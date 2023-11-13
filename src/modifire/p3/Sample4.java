package modifire.p3;

public class Sample4 {

	Sample3 sample3 = new Sample3();
	
	public void method() {
		
		// private 접근제한이 적용된 value1 은 접근불가능
//		sample3.value1 = 10; 컴파일 오류 발생
		
		// 디폴트 접근제한이 적용된 value2 는 접근가능
		sample3.value2 = 20;
		
		// protected 접근제한이 적용된 value3 는 접근가능
		sample3.value3 = 30;
		
		// public 접근제한이 적용된 value4 는 접근가능
		sample3.value4 = 40;
		
	}
}
