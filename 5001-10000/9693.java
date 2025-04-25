import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = 1;
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				break;
			}
			
			int answer = 0;
			for(int i = 5; i <= n; i *= 5) {
				answer += n / i;
			}
			
			sb.append("Case #").append(t++).append(": ").append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
