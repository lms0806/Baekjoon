import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[] prime = new boolean[1000001];
		for(int i = 2; i * i <= 1000000; i++) {
			if(!prime[i]) {
				for(int j = i * i; j <= 1000000; j += i) {
					prime[j] = true;
				}
			}
		}
		
		StringBuilder answer = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				break;
			}
			
			StringBuilder sb = new StringBuilder();
			for(int i = 3; i <= n; i += 2) {
				if(!prime[i]) {
					for(int j = n; j > 0; j--) {
						if(i + j < n) {
							break;
						}
						if(!prime[j] && j % 2 == 1 && i + j == n) {
							sb.append(n).append(" = ").append(i).append(" + ").append(j);
							break;
						}
					}
				}
				
				if(sb.length() != 0) {
					break;
				}
			}
			
			answer.append(sb.length() == 0 ? "Goldbach's conjecture is wrong." : sb).append("\n");
		}
		System.out.print(answer);
	}
}
