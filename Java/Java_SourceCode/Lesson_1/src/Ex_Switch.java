
import java.util.Scanner;

public class Ex_Switch {
	public static void main(String[] args) {
		
		System.out.println("홀, 짝수를 판별할 숫자를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		int r = i % 2;
		
		switch (r) {
		case 0:
			System.out.println("짝수 입니다.");
			break;
		case 1:
			System.out.println("홀수 입니다.");
			break;
			
		default:
			System.out.println("모르겠습니다.");
			break;
		}
		
	}
}
