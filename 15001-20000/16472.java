import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		char[] c = br.readLine().toCharArray();
		
		int[] alpha = new int[26];
		
		int s = 0, e = 0;
		alpha[c[0] - 'a']++;
		int count = 1, answer = 0;
		while(e < c.length) {
			if(count > n) {
				if(--alpha[c[s] - 'a'] == 0) {
					count--;
				}
				s++;
			}
			else {
				answer = Math.max(answer, e - s + 1);
				e++;
				
				if(e < c.length) {
					if(alpha[c[e] - 'a']++ == 0) {
						count++;
					}
				}
			}
		}
		System.out.print(answer);
	}
}
