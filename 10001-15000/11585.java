import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			sb.append(st.nextToken());
		}
		String pattern = sb.toString();
		
		sb = new StringBuilder();
		st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			sb.append(st.nextToken());
		}
		String pa = (sb.toString() + sb.toString()).substring(0, (n << 1) - 1);

		System.out.print("1/" + (n / KMP(pa, pattern)));
	}
	
	public static int[] getpi(String s1) {
		int[] pi = new int[s1.length()];
		int j = 0;
		for(int i = 1; i < s1.length(); i++) {
			while(j > 0 && s1.charAt(i) != s1.charAt(j)) {
				j = pi[j - 1];
			}
			if(s1.charAt(i) == s1.charAt(j)) {
				pi[i] = ++j;
			}
		}
		return pi;
	}
	
	public static int KMP(String s, String s1) {
		int[] pi = getpi(s1);
		int j = 0;
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			while(j > 0 && s.charAt(i) != s1.charAt(j)) {
				j = pi[j - 1];
			}
			if(s.charAt(i) == s1.charAt(j)) {
				if(j == s1.length() - 1) {
					count++;
					j = pi[j];
				}
				else {
					j++;
				}
			}
		}
		return count;
	}
}
