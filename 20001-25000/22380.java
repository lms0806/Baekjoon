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
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			
			if(n == 0) {
				break;
			}
			
			int size = m / n;
			
			int answer = 0;
			st = new StringTokenizer(br.readLine());
			while(n --> 0) {
				int num = Integer.parseInt(st.nextToken());
				answer += num > size ? size : num;
			}
			
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
