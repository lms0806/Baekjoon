import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		String s = br.readLine();
		
		int answer = 0;
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == '[') {
				answer++;
			}
			else if(c == ']') {
				if(i < s.length() - 1 && s.charAt(i + 1) != '[') {
					answer++;	
				}
			}
			else {
				if(c == s.charAt(i - 1)) {
					answer += 2;
				}
				else {
					answer++;
				}
			}
		}
		System.out.print(answer);
	}
}
