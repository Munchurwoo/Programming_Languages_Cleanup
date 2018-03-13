import java.util.Scanner;
public class Ex_if {

	public static void main(String[] args) {
		//사용자로부터 국어, 영어, 수학 점수를 입력 받아, 각 과목별 점수가 평균 이상인지 이하인지 구해보자
		Scanner sc = new Scanner(System.in);
		
		/**
		Scanner 객체생성 후, 국어, 영어, 수학 점수를 입력받음 
		 **/
		
		System.out.println("국어 점수를 입력하세요.");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		int math = sc.nextInt();
		
		int sum = 0; // 합계 변수 초기값
		int avg = ( kor + eng + math ) / 3; // 세 과목의 평균 구하기
		
		// 아래 출력 형식인 %d 는 printf 메소드 출력 형식으로 c언어와 동일 합니다. 
		// 모르시면 google -> java 포맷형식 검색 
		System.out.printf("수학점수는 %d점 , 영어 점수는 %d점 , 수학 점수는 %d점, 세과목의 평균은 %d 점 입니다. %n", kor, eng, math, avg);
		
		// 아래 문법은 기본 조건문을 활용한 조건판별입니다.
		// 국어 점수 판단 
		if (kor > avg) {
			System.out.println("국어 점수는 평균보다 높습니다.");
		}else if(kor <avg) {
			System.out.println("국어 점수는 평균보다 낮습니다.");
		}else {
			System.out.println("국어 점수는 평균입니다.");
		}
		//영어 점수 판단
		if (eng > avg) {
			System.out.println("영어 점수는 평균보다 높습니다.");
		}else if(eng <avg) {
			System.out.println("영어 점수는 평균보다 낮습니다.");
		}else {
			System.out.println("영어 점수는 평균입니다.");
		}
		//수학 점수 판단 
		if (math > avg) {
			System.out.println("수학 점수는 평균보다 높습니다.");
		}else if(math <avg) {
			System.out.println("수학 점수는 평균보다 낮습니다.");
		}else {
			System.out.println("수학 점수는 평균입니다.");
		}
	}
}
