import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[] check = new int[10];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		
		solve(1, n, 1);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 10; i++) {
			sb.append(check[i]).append(" ");
		}
		System.out.print(sb);
	}
	
	public static void solve(long a, long b, long count) {
		while(a % 10 != 0 && a <= b) {
			calc(a, count);
			a++;
		}
		
		if(a > b) {
			return;
		}
		
		while(b % 10 != 9 && a <= b) {
			calc(b, count);
			b--;
		}
		
		long c = b / 10 - a / 10 + 1;
		for(int i = 0; i < 10; i++) {
			check[i] += c * count;
		}
		
		solve(a / 10, b / 10, count * 10);
	}
	
	public static void calc(long n, long count) {
		long num = n;
		while(num != 0) {
			check[(int) (num % 10)] += count;
			num /= 10;
		}
	}
}
