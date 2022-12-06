import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[] prime = new boolean[51];
		
		for(int i = 2; i * i <= 50; i++) {
			if(!prime[i]) {
				for(int j = i * i; j <= 50; j += i) {
					prime[i] = true;
				}
			}
		}
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		sb.append(n).append("\n");
		
		for(int i = 1; i < n; i++) {
			sb.append(i).append(" ");
		}
		sb.append(997);
		System.out.print(sb);
	}
}
