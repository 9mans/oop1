package overloding;

public class CalculatorApp {

	public static void main(String[] args) {
		
		Calculator c= new Calculator();
		
		double result1 = c.sum(1.2, 3.2);
		int result2 = c.sum(20, 30, 40);
		
		System.out.println("첫번째 실행결과: " + result1);
		System.out.println("두번째 실행결과: " + result2);
	}
}
