import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		boolean[] prime = new boolean[10001];
		
		for(int i = 2; i * i <= 10000; i++) {
			if(!prime[i]) {
				for(int j = i * i; j <= 10000; j += i) {
					prime[j] = true;
				}
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			int a = -10000 , b = 10000;
			for(int i = n / 2; i < n; i++) {
				if(!prime[i] && !prime[n - i]) {
					if(Math.abs(a - b) > n) {
						a = n - i;
						b = i;
					}
				}
			}
			
			sb.append(a).append(" ").append(b).append("\n");
		}
		System.out.print(sb);
	}
}
