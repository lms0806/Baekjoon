import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		String s = br.readLine();
		int max = 0;
		for(int i = 0; i < s.length(); i++) {
			max = Math.max(max, getpi(s.substring(i, s.length())));
		}
		System.out.print(max);
	}
	
	public static int getpi(String s) {
		int[] pi = new int[s.length()];
		int j = 0, max = 0;
		for(int i = 1; i < s.length(); i++) {
			while(j > 0 && s.charAt(i) != s.charAt(j)) {
				j = pi[j - 1];
			}
			if(s.charAt(i) == s.charAt(j)) {
				max = Math.max(max, pi[i] = j += 1);
			}
		}
		return max;
	}
}
