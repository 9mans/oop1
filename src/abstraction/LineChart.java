package abstraction;

//추상화로 메소드의 재정의를 강제한다
// 사용법이 동일한 하위클래스를 만들기위해 추상 메소드를 사용한다 <--- 추상화


// 구현클래스란 abstract 가없는 클래스
// 추상 메소드를 보유할 수 없다
// 부모로부터 추상 메소드를 상속받았다면 반드시 메소드 재정의 해야한다
public class LineChart extends Chart {

	@Override // <---- 어노테이션
	public void draw() {
		System.out.println("꺾은선 그래프를 그립니다");
	}
	
	
}
