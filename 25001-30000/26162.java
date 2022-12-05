import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[] prime = new boolean[119];
		for(int i = 2; i <= 118; i++) {
			if(!prime[i]) {
				for(int j = i * i; j <= 118; j += i) {
					prime[j] = true;
				}
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			sb.append(solve(prime, Integer.parseInt(br.readLine()))).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String solve(boolean[] prime, int n) {
		for(int i = 2; i < prime.length; i++) {
			if(prime[i]) {
				continue;
			}
			for(int j = 2; j < prime.length; j++) {
				if(i + j > n) {
					break;
				}
				
				if(!prime[j] && i + j == n) {
					return "Yes";
				}
			}
		}
		return "No";
	}
}
