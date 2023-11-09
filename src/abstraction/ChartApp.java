package abstraction;

public class ChartApp {

	public static void main(String[] args) {
		
		// chart 추상 클래스를 구현한 다양한 구현클래스로 객체만들기
		// chart 추상 클래스를 상속받은 구현클래스들은 전부 차트그리기 기능을
		// draw()라는 메소드명으로 재정의하고 있다
		// chart 추상 클래스를
		Chart c1 = new LineChart();
		Chart c2 = new BarChart();
	}
}
