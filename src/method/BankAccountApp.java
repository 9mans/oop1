package method;


public class BankAccountApp {
	
	public static void main(String[] args) {
		
		// 계좌정보 객체를 생성하고 기능 사용하기
		
		// 객체 만들기
		
		BankAccount acc1 = new BankAccount("김유신", "12-34-5678", 1111, 1000000L, 0.05);
		
		// 계좌정보 조회하기
		acc1.display();
		
		// 입금하기
		acc1.deposit(30000);
		System.out.println();
		acc1.deposit(5000000);
		System.out.println();
		acc1.deposit(450000);
		System.out.println();
		
		//출금하기
		long amount1 = acc1.withdraw(1000000, 1111);
		System.out.println("출금액: " + amount1);
		
		
		//비밀번호 변경하기
		acc1.changePassword(1234, 1234);
		acc1.changePassword(1111, 1234);
		acc1.changePassword(1234, 1234);
		System.out.println();
		
		//해지하기
		acc1.terminate(1111);
		System.out.println();
		long amount = acc1.terminate(1234);
		System.out.println("혜지금액: " + amount);
	}
}
