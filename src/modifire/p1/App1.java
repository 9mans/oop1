package modifire.p1;

public class App1 {

	public static void main(String[] args) {
		
		/*
		 * app1은 sample1, sample2 와 같은 패키지에 있는 클래스
		 *  - app1은 sample1, sample2를 import 구문없이 사용가능
		 *  - app1은 디폴트 접근제한이 적용된 sample1
		 *  	    public 접근제한이 적용된 sample2 전부 접근 가능
		 */
		Sample1 sample1 = new Sample1();
		Sample2 sample2 = new Sample2();
	}
}
