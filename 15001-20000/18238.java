import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int answer = 0;
		char now = 'A';
		
		for(char c : br.readLine().toCharArray()) {
			int n = Math.abs(now - c);
			
			answer += Math.min(n, 26 - n);
			now = c;
		}
		System.out.print(answer);
	}
}
