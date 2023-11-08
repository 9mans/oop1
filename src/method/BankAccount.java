package method;

public class BankAccount {

	// 은행 계좌 클래스 설계 하기
	/*
	 * 	-속성
	 * 		+ 예금주(String), 계좌번호(String), 비밀번호(int), 잔액(long), 이율(double)
	 * 
	 * 	-기능
	 * 		+ 조회기능
	 * 			예금주, 계좌번호, 현재 잔액을 화면에 출력한다
	 * 			
	 * 			반환타입: void
	 * 			메소드이름: display
	 * 			매개변수: 없음
	 * 
	 * 			public void display() {
	 * 				// TODO
	 * 			}
	 * 
	 *		+ 입금기능
	 *			신규 입금액을 전달 받아서 잔액을 증가시킨다
	 *			
	 *			반환타입: void
	 *			메소드이름: deposit
	 *			매개변수: int amount
	 *		
	 *			public void deposit(int amount) {
	 *				// TODO
	 *			}
	 *		
	 *		+ 출금기능
	 *			출금액, 비밀번호를 전달받아서 인증이 통과되면 출금액만큼 잔액 감소, 출금액만큼 금액 반환
	 *
	 *			반환타입: int
	 *			메소드이름: withdraw
	 *			매개변수: int amount, int pwd
	 *
	 *			public int withdraw(int amount, int pwd) {
	 *				//TODO
	 *			}		
	 *		
	 *		+ 비밀번호변경기능
	 *			이전 비밀번호, 새비밀번호를 전달받아서 인증이 통과되면 비밀번호를 새 비밀번호로 대체한다
	 *
	 *			반환타입: void
	 *			메소드이름: changePassword
	 *			매개변수: int prePwd, int newPwd
	 *
	 *			public void changePassword(int prePwd, int newPwd) {
	 *				//TODO
	 *			}
	 *		
	 *		+ 해지기능
	 *			비밀번호를 전달받아서 인증이 통과되면 현재 잔액과 이율을 계산해서 최종 해지 예상금액을 반환한다
	 *
	 *			반환타입: long
	 *			메소드이름: terminate
	 *			매개변수: int pwd 
	 *			
	 *			public long terminate(int pwd) {
	 *				//TODO
	 *			}
	 * 
	 */
		
	// 멤버변수 (인스턴스변수) 정의하기
	String owner;			//예금주
	String accNo;			//계좌번호
	int password;			//비밀번호
	long balance;			//현재 잔액
	double interestRate;	// 이율
	
	// 생성자 정의하기
	public BankAccount(String owner, String accNo, int password, long balance, double interestRate) {
		this.owner = owner;
		this.accNo = accNo;
		this.password = password;
		this.balance = balance;
		this.interestRate = interestRate;
		
	}
	
	// 멤버 메소드 정하기
	
	// 계좌정보 화면에 출력하기
	public void display() {
		System.out.println("### 계좌정보 ###");
		System.out.println("예금주: " + owner);
		System.out.println("계좌번호: " + accNo);
		System.out.println("현재잔액: " + balance);
	}
	
	/**
	 * 입금액을 전닯 받아서 계좌의 잔액을 증가시킴
	 * @param amount 입금액
	 */
	public void deposit(int amount) {
		System.out.println("### 입금액: " + amount);
		balance += amount;
		
		System.out.println("### 입금 후 `잔액" + balance);
		System.out.println("### 입금완료");
	}
	
	/**
	 * 출금금액, 비밀번호를 전달 받아서 인증이 완료되면 요구금액만큼 출금액 반환
	 * @param amount 출금요구금액
	 * @param pwd 비밀번호
	 * @return 출금액, 비밀번호가 일치하지 않으면 출금액 0
	 */ 
	public long withdraw(int amount, int pwd) {
		// 빠른 종료 나쁜 경우를 먼저 찾아서 제거해야함
 		if (password != pwd) {
 			System.out.println("### 비밀번호 오류");
 			return 0;
 		}
 		
 		balance -= amount;
 		System.out.println("### 출금 후 잔액: " + balance);
 		return amount;
	}
	
	/**
	 * 이전 비밀번호와 새 비밀번호를 전달 받아서 비밀번호를 변경합니다
	 * 이전 비밀번호와 비밀번호가 일치하고 새 비밀번호가 이전 비밀번호와 일치하지 않아야한다
	 * @param oldPwd 이전 비밀번호
	 * @param newPwd 새 비밀번호
	 */
	public void changePassword(int oldPwd, int newPwd) {
		if(oldPwd != password) {
			System.out.println("### 비밀번호 오류 변경 불가능");
			return;
		}
		
		if (oldPwd == newPwd) {
			System.out.println("### 비밀번호 변경 실패 이전 비밀번호와 중복");
			return;
		}
		
		password = newPwd;
		System.out.println("### 비밀번호 변경완료");
	 	}
	
	/**
	 * 비밀번호를 전달받아서 계좌를 해지시킨다 혜지가 완료되면 환급금을 반환한다
	 * @param pwd 비밀번호
	 * @return 혜지환급금, 현재 잔엑에 이율을 적용한금액임
	 */
	public long terminate(int pwd) {
		if (pwd != password) {
			System.out.println("### 비밀번호 불일치");
			return 0;
		}
		
		System.out.println("현재 이율" + interestRate);
		System.out.println("### 계좌혜지 완료");
		long amount = balance + (long)(balance*interestRate);
		return amount;
	}


}
	
	
	
	

