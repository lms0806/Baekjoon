import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s  = br.readLine();
		
		int len = s.length() / 2;
		s += s.substring(0, s.length() / 2);
		
		int sum = 0;
		for(int i = 0; i < len; i++) {
			if(s.charAt(i) == 'B') {
				sum++;
			}
		}
		
		int answer = sum;
		for(int i = len; i < s.length(); i++) {
			if(s.charAt(i) == 'B') {
				sum++;
			}
			if(s.charAt(i - len) == 'B') {
				sum--;
			}
			answer = Math.max(answer, sum);
		}
		
		System.out.print(answer);
	}
}
