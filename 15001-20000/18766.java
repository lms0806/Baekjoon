import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			String[] s = new String[n], s1 = new String[n];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				s[i] = st.nextToken();
			}
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				s1[i] = st.nextToken();
			}
			
			Arrays.sort(s);
			Arrays.sort(s1);
			
			sb.append(solve(s, s1) + "CHEATER").append("\n");
		}
		System.out.print(sb);
	}
	
	public static String solve(String[] s, String[] s1) {
		for(int i = 0; i < s.length; i++) {
			if(!s[i].equals(s1[i])) {
				return "";
			}
		}
		return "NOT ";
	}
}
