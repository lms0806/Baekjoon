import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder answer = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			StringBuilder sb = new StringBuilder();
			while(n > 0) {
				n--;
				sb.append((char)(n % 26 + 'A'));
				n /= 26;
			}
			answer.append(sb.reverse()).append("\n");
		}
		System.out.print(answer);
	}
}
