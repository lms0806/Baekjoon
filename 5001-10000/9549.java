import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			String s1 = br.readLine(), s2 = br.readLine();
			int[] a = new int[26], b = new int[26];
			for(int i = 0; i < s2.length(); i++) {
				a[s1.charAt(i) - 'a']++;
				b[s2.charAt(i) - 'a']++;
			}
			
			sb.append(solve(s1, a, b, s2.length())).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String solve(String s, int[] a, int[] b, int len) {
		if(check(a, b)) {
			return "YES";
		}
		
		for(int i = len; i < s.length(); i++) {
			a[s.charAt(i - len) - 'a']--;
			a[s.charAt(i) - 'a']++;
			
			if(check(a, b)) {
				return "YES";
			}
		}
		return "NO";
	}
	
	public static boolean check(int[] a, int[] b) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}
}
