import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().trim());
		
		int t = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
		
		int answer = 0, num = n;
		while(t --> 0) {
			String s = br.readLine().trim();
			
			num -= sum(s);
			
			if(num < 0) {
				num = n - sum(s);
				answer++;
			}
		}
		System.out.print(answer);
	}
	
	public static int sum(String s) {
		return s.contains("L") ? Integer.parseInt(s.substring(0, s.length() - 1)) + 1 : Integer.parseInt(s);
	}
}
