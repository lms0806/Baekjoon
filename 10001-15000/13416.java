import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			int answer = 0;
			while(n --> 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int num = 0;
				for(int i = 0; i < 3; i++) {
					num = Math.max(num, Integer.parseInt(st.nextToken()));
				}
				answer += num;
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
