import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String s = br.readLine();
		
		int answer = 0;
		String str = s.charAt(0) + "";
		for(int i = 1; i < s.length(); i++) {
			if(s.charAt(i - 1) + 1 == s.charAt(i)) {
				str += s.charAt(i) + "";
			}
			else {
				if(str.length() == 3) {
					answer++;
				}
				str = s.charAt(i) + "";
			}
		}
		
		if(str.length() == 3) {
			answer++;
		}
		
		System.out.print(answer);
	}
}
