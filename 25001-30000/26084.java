import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] ch = br.readLine().toCharArray();
		
		int n = Integer.parseInt(br.readLine());
		
		long[] arr = new long[26];
		for(int i = 0; i < n; i++) {
			char c = br.readLine().charAt(0);
			
			arr[c - 'A']++;
		}
		
		long answer = 1;
		long[] alpha = new long[26];
		for(char c : ch) {
			answer *= arr[c - 'A'];
			alpha[c - 'A']++;
			arr[c - 'A']--;
		}
		
		for(long a : alpha) {
			while(a > 1) {
				answer /= a;
				a--;
			}
		}
		System.out.print(answer);
	}
}
