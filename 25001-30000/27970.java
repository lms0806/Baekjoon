import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long answer = 0, num = 1;
		for(char c : br.readLine().toCharArray()) {
			if(c == 'O') {
				answer += num;
				answer %= 1000000007;
			}
			
			num *= 2;
			num %= 1000000007;
		}
		System.out.print(answer);
	}
}
