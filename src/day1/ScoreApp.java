package day1;

public class ScoreApp {

	public static void main(String[] args) {
		
		Score score1 = new Score();
		score1.setUp("이순신", 70, 80, 90);
		
		Score score2 = new Score();
		score2.setUp("강감찬", 80, 80, 80);

		Score score3 = new Score();
		score3.setUp("홍길동", 50, 80, 80);
		
		// 각 객체에 저장된 성적정보 출력하기
		score1.printScore();
		score2.printScore();
		score3.printScore();
		
	}
}
