package modifire.p4;

import modifire.p3.Sample3;

public class Sample3Child extends Sample3 {

	public void method() {
		// 상속 받았기 때문에 바로 접근 가능
		
		// private 접근제한이 적용된 value1 은 접근 불가능
//		value1 = 10;
		
		// defult 접근제한이 적용된 value2 은 접근 불가능
//		value2 = 10;
		
		// protected 접근제한이 적용된 value3 은 접근가능(상속)
		value3 = 10;
		
		// public 접근제한이 적용된 value4 은 접근가능
		value4 = 10;
	}
}
