import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		String w = br.readLine(), s = br.readLine();
		
		int[] a = new int[52], b = new int[52];
		for(int i = 0; i < w.length(); i++) {
			add(w.charAt(i), a, 1);
			add(s.charAt(i), b, 1);
		}
		
		int answer = check(a, b);
		for(int i = w.length(); i < s.length(); i++) {			
			add(s.charAt(i - w.length()), b, -1);
			add(s.charAt(i), b, 1);
			
			answer += check(a, b);
		}
		System.out.print(answer);
	}
	
	public static void add(char c, int[] num, int dif) {
		if('a' <= c && c <= 'z') {
			num[c - 'a'] += dif;
		}
		else {
			num[c - 'A' + 26] += dif;
		}
	}
	
	public static int check(int[] a, int[] b) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] != b[i]) {
				return 0;
			}
		}
		return 1;
	}
}
