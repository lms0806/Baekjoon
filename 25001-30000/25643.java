import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		String s = br.readLine();
		
		int answer = 1;
		while(n --> 1) {
			String str = br.readLine();
			
			if(check(s, str)) {
				s = str;
			}
			else {
				answer = 0;
				break;
			}
		}
		System.out.print(answer);
	}	
	
	public static boolean check(String s, String str) {
		for(int i = 0; i < s.length(); i++) {
			if(s.substring(s.length() - i - 1).equals(str.substring(0, i + 1))) {
				return true;
			}
		}
		for(int i = 1; i < s.length(); i++) {
			if(s.substring(0, s.length() - i).equals(str.substring(i))) {
				return true;
			}
		}
		return false;
	}
}
