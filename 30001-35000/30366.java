import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int answer = 0, sum = 0;
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(n --> 0) {
			int num = Integer.parseInt(st.nextToken());
			
			if(sum + num <= m) {
				sum += num;
			}
			else {
				answer++;
				sum = num;
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
