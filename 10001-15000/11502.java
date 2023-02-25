import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static boolean[] prime;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		prime = new boolean[1001];
		
		prime[0] = prime[1] = true;
		
		for(int i = 2; i < 1001; i++) {
			if(!prime[i]) {
				for(int j = i * i; j < 1001; j += i) {
					prime[j] = true;
				}
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			sb.append(solve(n)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String solve(int n) {
		for(int i = 2; i < n; i++) {
			if(prime[i]) {
				continue;
			}
			
			for(int j = 2; j < n; j++) {
				if(prime[j]) {
					continue;
				}
				
				for(int k = 2; k < n; k++) {
					if(prime[k]) {
						continue;
					}
					if(i + j + k == n) {
						return i + " " + j + " " + k;
					}
				}
			}
		}
		return "0";
	}
}
