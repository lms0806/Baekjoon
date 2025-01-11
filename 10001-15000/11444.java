import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static long[][] origin = {{1, 1}, {1, 0}};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		
		long[][] a = {{1, 1}, {1, 0}};
		
		System.out.print(solve(a, n - 1)[0][0]);
	}
	
	public static long[][] solve(long[][] a, long n){
		if(n < 2) {
			return a;
		}
		
		long[][] num = solve(a, n / 2);
		
		num = multi(num, num);
		
		if(n % 2 == 1L) {
			num = multi(num, origin);
		}
		
		return num;
	}
	
	public static long[][] multi(long[][] o1, long[][] o2){
		long[][] num = new long[2][2];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				for(int k = 0; k < 2; k++) {
					num[j][k] += o1[j][i] * o2[i][k];
					num[j][k] %= 1000000007;
				}
			}
		}
		return num;
	}
}
