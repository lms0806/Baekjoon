import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long n = Long.parseLong(st.nextToken());
		long m = Long.parseLong(st.nextToken());
		
		boolean[] prime = new boolean[10000001];
		for(int i = 2; i * i < prime.length; i++) {
			if(!prime[i]) {
				for(int j = 2 * i; j < prime.length; j += i) {
					prime[j] = true;
				}
			}
		}
		
		long answer = 0;
		for(int i = 2; i < prime.length; i++) {
			if(!prime[i]) {
				for(int j = 2; ; j++) {
					long num = (long)Math.pow(i, j);
					
					if(n <= num && num <= m) {
						answer++;
					}
					
					if(num > m) {
						break;
					}
				}
			}
		}
		
		System.out.print(answer);
	}
}
