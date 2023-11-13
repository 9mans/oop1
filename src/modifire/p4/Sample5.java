package modifire.p4;

import modifire.p3.Sample3;

public class Sample5 {

	Sample3 sample3 = new Sample3();
	
	public void method() {
		
		// private 접근제한이 적용된 value1 은 접근불가능
//		sample3.value1 = 10;
		
		// 디폴트 접근제한이 적용된 value2 는 접근불가능
//		sample3.value2 = 30;
		
		// protected 접근제한이 적용된 value3 는 접근불가능
//		sample3.value3 = 20;
		
		// public 접근제한이 적용된 value4 는 접근가능
		sample3.value4 = 10;
	}
}
