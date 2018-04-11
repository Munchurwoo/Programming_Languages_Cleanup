import java.util.Scanner;

public class arrayExam {
	public static void main(String[] args) {

		String[] Student = { "철우", "동석", "해랑", "민희", "동희" };
		int[] StuHeight = new int[5];
		int avgH = 0;
		int maxH = 0;
		int maxHIndex =0; int minH =0; int minHIndex = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("각 학생들의 키를 입력하세요.");
		for (int i = 0; i < Student.length; i++) {
			System.out.println(Student[i]);
			StuHeight[i] = scan.nextInt();
			avgH += StuHeight[i];
		}
		// 키가 제일 큰 학생 출력
		for (int i = 0; i < Student.length; i++) {
			if(StuHeight[i] > maxH) {
				maxH = StuHeight[i];
				maxHIndex = i ;
			}
		}
		
		// 키가 제일 작은 학생 출력
		for (int i = 0; i < Student.length; i++) {
			minH= maxH;
			if(StuHeight[i]<minH) {
				minH=StuHeight[i];
				minHIndex = i;
			}
		}
		// 학생별 키 출력
		for (int i = 0; i < Student.length; i++) {
			System.out.print(Student[i] + "=" + StuHeight[i] + "\t");
		}
		System.out.println();
		System.out.printf("키가 가장 큰 학생은 %s 이고, 키는 %d 입니다. \n" ,Student[maxHIndex], StuHeight[maxHIndex]);
		System.out.printf("키가 가장 작은 학생은 %s 이고, 키는 %d 입니다." ,Student[minHIndex], StuHeight[minHIndex]);
		System.out.println("cherwoo.tistory.com 블로그 주소입니다.");
	}

}
