package modifire.p3;

public class Sample3 {

	/*
	 *  private 접근제한이 적용된 멤버변수
	 *   - 같은 클래스 내부에서만 접근 가능
	 *   - 다른 클래스에서는 접근 불가능
	 */
	private int value1;
	
	/*
	 * 디폴트 접근제한이 적용된 멤버변수
	 *  - 같은 패키지내의 다른 클래스에도 접근가능
	 */
	int value2;
	
	/*
	 *  protected 접근제한이 적용된 멤버변수
	 *   - 같은 패키지내의 다른 클래스에서도 접근가능
	 *   - 다른 패키지에 위치하는 클래스에서는 접근이 허용되지 않는다
	 *     단 이 클래스를 삭송받은 하위 클래스는 다른 패키지여도 접근가능
	 */
	protected int value3;
	
	/*
	 *  public 접근제한이 적용된 멤버변수
	 *   - 전체공개
	 */
	public int value4;
}
