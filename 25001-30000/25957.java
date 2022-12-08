import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	static int n, answer = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		HashMap<String, String> map = new HashMap<>();
		while(n --> 0) {
			String s = br.readLine();
			
			if(s.length() > 3) {
				char[] c = s.toCharArray();
				
				Arrays.sort(c, 1, s.length() - 1);
				
				map.put(new String(c), s);
			}
		}
		
		int m = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(m --> 0) {
			String s = st.nextToken();
			
			if(s.length() < 4) {
				sb.append(s);
			}
			else {
				char[] c = s.toCharArray();
				
				Arrays.sort(c, 1, c.length - 1);
				
				String check = new String(c);	
				
				sb.append(map.containsKey(check) ? map.get(check) : s);
			}
			sb.append(" ");
		}
		System.out.print(sb);
	}
}
