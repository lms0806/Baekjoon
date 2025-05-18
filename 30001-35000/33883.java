import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		int count = "aeiouns".indexOf(s.charAt(s.length() - 1)) < 0 ? 1 : 2;
		
		int answer = -1;
		for(int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			
			if("aeiou".indexOf(c) >= 0) {
				count--;
				
				if(count == 0) {
					answer = i + 1;
					break;
				}
			}
		}
		System.out.print(answer);
	}
}
