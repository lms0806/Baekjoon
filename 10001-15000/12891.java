import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		String s = br.readLine();
		
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken()), g = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());
		
		int[] alpha = new int[26];
		for(int i = 0; i < m; i++) {
			alpha[s.charAt(i) - 'A']++;
		}
		
		int answer = check(a, c, g, t, alpha) ? 1 : 0;
		for(int i = m; i < n; i++) {
			alpha[s.charAt(i) - 'A']++;
			alpha[s.charAt(i - m) - 'A']--;
			
			answer += check(a, c, g, t, alpha) ? 1 : 0;
		}
		System.out.print(answer);
	}
	
	public static boolean check(int a, int c, int g, int t, int[] alpha) {
		return alpha[0] >= a && alpha[2] >= c && alpha[6] >= g && alpha[19] >= t;
	}
}
