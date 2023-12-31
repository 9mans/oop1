package static1;

import java.text.SimpleDateFormat;
import java.util.Date;

// 명령행인자 찾아보기
/**
 *  날짜와 시간정보를 원하는 형식의 문자열로 표현하는 정적 메소드를 제공하는 클래스
 */
public class DateUtils {
	
	public static String dateToString(Date date) {
		/**
		 *  날짜를 전달받아서 "년 월 일" 형식의 문자열로 반환하는 정적 메소드다
		 *  @param date 날자
		 *  @return "년월일" 형식의 문자열
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(date);
	}
	
	/**
	 * 날짜를 전달 받아서  "년 월 일 시:분:초" 형식의 문자열로 반환하는 정적 메소드다
	 * @param date 날짜
	 * @return "년월일 시분초" 형식의 문자열
	 */
	public static String dateToDetailString(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date);
	}

	/**
	 * 날짜를 전달받아서 "2023년 10월 3일 화요일 오전 11시 20분 1초" 형식의 문자열
	 * 반환하는 정적메소드
	 * @param date
	 * @return
	 */
	public static String dateToLocaleString(Date date) {
		String pattern = "yyyy년 M월 d일 EEEE a h시 m분 s초";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(date);
	}

}
