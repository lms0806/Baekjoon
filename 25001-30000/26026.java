import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		br.readLine();
		
		int coffee = 0, answer = 0;
		for(char c : br.readLine().toCharArray()) {
			if(c == '1') {
				coffee = 2;
				answer++;
			}
			else if(coffee > 0) {
				coffee--;
				answer++;
			}
		}
		System.out.print(answer);
	}
}
