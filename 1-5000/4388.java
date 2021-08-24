import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long a = Long.parseLong(st.nextToken()), b = Long.parseLong(st.nextToken());
			
			if(a == 0 && b == 0) {
				break;
			}
			
			int answer = 0, n = 0;
			while(a > 0 || b > 0) {
				long ch = a % 10, ch1 = b % 10;
				
				if(ch + ch1 + n > 9) {
					answer++;
					n = 1;
				}
				else {
					n = 0;
				}
				
				a /= 10;
				b /= 10;
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
