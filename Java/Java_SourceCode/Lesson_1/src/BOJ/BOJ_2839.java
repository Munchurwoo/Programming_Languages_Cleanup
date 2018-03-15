package BOJ;

public class BOJ_2839 {

	public static void main(String[] args) {
		int X=0;
		int N = 6;
        while(true){
            if(N%5==0){
                System.out.printf("%d", N/5 + X);
                break;
            }else if(N<=0){
                System.out.print(-1);
                break;
            }
            N -= 3;
            X++;
        }
	}
}