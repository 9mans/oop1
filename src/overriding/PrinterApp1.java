package overriding;

public class PrinterApp1 {

	public static void main(String[] args) {
		
		Printer p1 = new Printer();
		p1.print(); // printer 객체의 기능
		
		ColorPrinter p2 = new ColorPrinter();
		p2.print(); // colorPrinter 의 재정의된 print()가 실행됨
		
		Printer p3 = new ColorPrinter();
		p3.print(); 
					// 데이터타입이 부모클래스여도 사용하고자하는 메소드가 실행된다 (다형성 발현조건 메소드재정의 클래스형변환)
					// printer 객체를 참조하고 있어도 실제 생성한
					// colorPrinter객체의 재정의된 print()가 실행된다
					// printer 타입의 참조변수로 자식 printer 객체를 참조하고 있을 때
					// print()를 실행하면 실제 생성된 객체에 재정의된 print()가 실행된다
		
	}
}
