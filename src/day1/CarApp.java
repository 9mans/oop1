package day1;

public class CarApp {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		// 자동차의 현재 속도를 화면에 출력하자
		car.printCurrentSpeed();
		
		// 자동차의 현재 속도를 증가시킨다
		car.speedUp();
		car.printCurrentSpeed();
		// 자동차의 현재 속도를 30으로 바꾸자
		car.changeCurrentSpeed(30);
		car.printCurrentSpeed();
		// 자동차의 현재 속도를 조회하자
		int speed = car.getCurrentSpeed();
		System.out.println("조회된 자동차의 현재 속도는 " + speed + " km/h");
	}
}
/*  메소드의 실행방법 파악하기(.찍고 컨트롤 스페이스를 눌렀을때)
 * 
 * changeCurrentSpeed(int speed): void - car
 * 	반환값이 없다
 * 	메소드 이름은 changeCurrentSpeed 다
 * 	메소드 실행시 전달할 인자값은 정수형의 속도값이다
 * 	car.changeCurrentSpeed(50);
 * 
 * speedUp(): void - Car
 * 	반환값이 없다
 * 	메소드이름은 speedUp
 * 	메소드 실행시 전달할 인자값이 없다
 * 	car.speedUp();
 * 
 * printCurrentSpeed(): void - car
 * 	반환값이 없다
 * 	메소드이름은 printCurrentSpeed
 * 	메소드 실행시 전달할 인자값은 없다
 * 	car.printCurrentSpeed();
 * 
 * getCurrentSpeed(): int - car
 * 	반환값이 있다 정수타입의 값을 반환한다 정수타입의 변수를 선언해서 값을 저장한다
 * 	메소드이름은 getCurrentSpeed
 * 	메소드 실행시 전달할 인자값은 없다
 * 	int speed = car.getCurrentSpeed();
 * 
*/
