import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		String[] str = {"Give you up", "Let you down", "Run around and desert you", "Make you cry", "Say goodbye", "Tell a lie and hurt you"};
		
		String answer = "YES";
		for(int i = 0; i < str.length; i++) {
			if(str[i].equals(s)) {
				answer = "NO";
				break;
			}
		}
		System.out.print(answer);
	}
}
