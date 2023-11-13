package modifire.p2;

/*
 *  디폴트 접근제한이 적용된 sample1 은 다른 패키지의 클래스에 접근불가능
 *   - import도 불가능 하다
 */

//import modifire.p1.sample1; 컴파일 오류 발생

/*
 *  public 접근제한이 적용된 sample2 은 다른 패키지의 클래스에서 접근가능
 *   - import 구문으로 포함시킨 후 사용가능
 */
import modifire.p1.Sample2;

public class App2 {

	public static void main(String[] args) {
		
		/*
		 *  app2는 sample1, sample2 와 다른 패키지에 존재하는 클래스
		 *   - 다른 패키지에 존재하는 클래스는 반드시 import 구문 작성 후 사용가능
		 *   - 
		 */
//		Sample1 sample1 = new Sample1(); 컴파일오류
		Sample2 sample2 = new Sample2();
	}
}
