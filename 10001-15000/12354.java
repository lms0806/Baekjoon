import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= test; t++) {
			int n = Integer.parseInt(br.readLine());
			
			int before = 0, answer = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(n --> 0) {
				int num = Integer.parseInt(st.nextToken());
				
				if(before >= num) {
					answer++;
				}
				
				before = num;
			}
			
			sb.append("Case #").append(t).append(": ").append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
