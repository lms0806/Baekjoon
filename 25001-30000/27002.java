import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static long a, b, answer;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[] prime = new boolean[20001];
		
		prime[0] = prime[1] = true;
		for(int i = 2; i * i < 20001; i++) {
			if(!prime[i]) {
				for(int j = i * i; j < 20001; j += i) {
					prime[j] = true;
				}
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		
		int answer = 1, max = 0;
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			int num = 0;
			for(int i = 1; i * i <= n; i++) {
				if(n % i == 0) {
					if(!prime[n / i]) {
						num = Math.max(num, n / i);
					}
					else if(!prime[i]) {
						num = Math.max(num, i);
					}
				}
			}
			
			if(max < num) {
				max = num;
				answer = n;
			}
		}
		System.out.print(answer);
	}
}
