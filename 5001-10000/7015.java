import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = getday(1000, 1, 1);
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			sb.append(n - getday(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()))).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int getday(int y, int m, int d) {
		int answer = 0;
		
		answer += (y - 1) * 195;
		answer += (y - 1) / 3 * 5;
		
		if(y % 3 != 0) {
			answer -= (m - 1) / 2;
		}
		
		answer += (m - 1) * 20;
		answer += d;
		
		return answer;
	}
}
