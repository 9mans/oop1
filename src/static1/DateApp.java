package static1;

import java.util.Date;

public class DateApp {

	public static void main(String[] args) { // String[] args <-- 명령행인자를 전달받는 매개변수
		
		// 현재 날짜와 시간정보를 표현하는 date 객체 생성하기
		Date now = new Date();
		System.out.println(now);
		
		String text1 = DateUtils.dateToString(now);
		System.out.println(text1);
		
		String text2 = DateUtils.dateToDetailString(now);
		System.out.println(text2);
		
		String text3 = DateUtils.dateToLocaleString(now);
		System.out.println(text3);
	}
	
	
}
