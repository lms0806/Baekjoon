import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		int answer = 0, num = 0;
		StringBuilder sb = new StringBuilder();
		while(n --> 0) {
			String s = br.readLine();
			
			if(s.equals("ammo")) {
				answer += k;
			}
			else if(s.equals("save")) {
				num = answer;
			}
			else if(s.equals("shoot")) {
				answer--;
			}
			else {
				answer = num;
			}
			
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
