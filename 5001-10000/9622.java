import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static long a, b, answer;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int answer = 0;
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			double a = Double.parseDouble(st.nextToken()), b= Double.parseDouble(st.nextToken()), c = Double.parseDouble(st.nextToken());
			double kg = Double.parseDouble(st.nextToken());
			
			if((a > 56 || b > 45 || c > 25) && a + b + c > 125 || kg > 7) {
				sb.append(0);
			}
			else {
				answer++;
				sb.append(1);
			}
			sb.append("\n");
		}
		System.out.print(sb.toString() + answer);
	}
}
