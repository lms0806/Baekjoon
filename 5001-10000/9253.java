import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		String a = br.readLine(), b = br.readLine();
		String check = br.readLine();
		System.out.print(KMP(a, check) == 1 && KMP(b, check) == 1 ? "YES" : "NO");
	}
	
	public static int[] getpi(String s1) {
		int[] pi = new int[s1.length()];
		int j = 0;
		for(int i = 1; i < s1.length(); i++) {
			while(j > 0 && s1.charAt(i) != s1.charAt(j)) {
				j = pi[j - 1];
			}
			if(s1.charAt(i) == s1.charAt(j)) {
				pi[i] = j += 1;
			}
		}
		return pi;
	}
	
	public static int KMP(String s, String s1) {
		int[] pi = getpi(s1);
		int j = 0;
		for(int i = 0; i < s.length(); i++) {
			while(j > 0 && s.charAt(i) != s1.charAt(j)) {
				j = pi[j - 1];
			}
			if(s.charAt(i) == s1.charAt(j)) {
				if(j == s1.length() - 1) {
					return 1;
				}
				else {
					j++;
				}
			}
		}
		return 0;
	}
}
