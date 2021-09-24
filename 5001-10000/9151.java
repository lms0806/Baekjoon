import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				break;
			}
			
			int answer = 0;
			for(int i = 1; first(i) <= n; i++) {
				answer = first(i);
			}
			
			for(int i = 1; second(i) <= n; i++) {
				answer = Math.max(answer, second(i));
			}
			
			for(int i = 1; first(i) <= n; i++) {
				for(int j = 1; first(i) + second(j) <= n; j++) {
					answer = Math.max(answer, first(i) + second(j));
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int first(int n) {
		return n * n * n;
	}
	
	public static int second(int n) {
		return (n * (n + 1) * (n + 2)) / 6;
	}
}
