import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String yonsei = "YONSEI", korea = "KOREA";
		int y = 0, k = 0;
		
		String answer = "";
		for(char c : br.readLine().toCharArray()) {
			if(c == yonsei.charAt(y)) {
				y++;
			}
			if(c == korea.charAt(k)) {
				k++;
			}
			
			if(y == yonsei.length()) {
				answer = yonsei;
				break;
			}
			if(k == korea.length()) {
				answer = korea;
				break;
			}
		}
		System.out.print(answer);
	}
}
