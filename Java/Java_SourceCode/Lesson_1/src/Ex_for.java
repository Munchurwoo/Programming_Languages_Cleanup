
public class Ex_for {

	public static void main(String[] args) {
//		 - 1에서 10까지의 합을 구해보자
		int sum = 0;
		for(int i=0; i<11; i++) {
			sum += i ;
		}
		System.out.println("1에서 10까지의 합은 : " + sum);

//		 - 1에서 10까지의 숫자 중 짝수 또는 홀수들의 합을 구해보자.
		int oddSum = 0;
		int evenSum = 0;
		for(int i =1; i<11; i++) {
			if(i%2==0) {
				oddSum += i;
			}else {
				evenSum += i;
			}
		}
		
		System.out.println("------------------------");
		System.out.printf("홀수의 합은 %d \n", oddSum);
		System.out.printf("짝수의 합은 %d \n", evenSum);
		System.out.println("------------------------");
//		 - 구구단을 만들어 보자. * 아래로 출력
		for(int i =2; i<10; i++) {
			for(int j = 1;j<10; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
//		- 구구단 가로로 출력 
		for(int i=1; i<10; i++) {
			System.out.println("");
			for(int j = 2; j<10; j++ ) {
				System.out.printf("%d * %d = %d \t", j,i,i*j);
			}
		}
	}
}
