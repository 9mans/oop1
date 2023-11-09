package abstraction;

/**
 * 모든 전화기들이 반드시 가져가야하는 기능에 대한 명세를 정의한다
 */
public interface Phone {
	
	void call(String number);
	void receive();
	void sms(String to, String message);
	
}
