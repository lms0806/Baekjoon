import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		boolean[] prime = new boolean[1000001];
		prime[0] = prime[1] = true;
		for(int i = 2; i * i < 1000001; i++) {
			if(!prime[i]) {
				for(int j = i * i; j < 1000001; j += i) {
					prime[j] = true;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			int answer = 0;
			for(int i = 2; i <= n / 2; i++) {
				if(!prime[i] && !prime[n - i]) {
					answer++;
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
