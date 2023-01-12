import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		int answer = 0;
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			while(c >= 'A' && c <= 'Z' && (i + answer) % 4 != 0) {
				answer++;
			}
		}
		System.out.print(answer);
	}
}
