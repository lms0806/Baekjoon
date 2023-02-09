import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int[] prime = new int[5000001];
		
		for(int i = 2; i < prime.length; i++) {
			prime[i] = i;
		}
		
		for(int i = 2; i * i < prime.length; i++) {
			if(prime[i] == i) {
				for(int j = i * i; j < prime.length; j += i) {
					if(prime[j] == j) {
						prime[j] = i;
					}
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(size --> 0) {
			int n = Integer.parseInt(st.nextToken());
			
			while(n > 1) {
				sb.append(prime[n]).append(" ");
				n /= prime[n];
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
