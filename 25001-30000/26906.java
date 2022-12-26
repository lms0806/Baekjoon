import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String[][] s = new String[n][2];
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			s[i][0] = st.nextToken();
			s[i][1] = st.nextToken();
		}
		
		String str = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length(); i += 4) {
			String check = str.substring(i, i + 4);
			
			sb.append(print(s, check));
		}
		System.out.print(sb);
	}
	
	public static String print(String[][] s, String check) {
		for(int i = 0; i < s.length; i++) {
			if(s[i][1].equals(check)) {
				return s[i][0];
			}
		}
		return "?";
	}
}
