import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		long answer = 0;
		for(int i = 0; i < n; i++) {
			char c = br.readLine().charAt(0);
			
			answer = (answer << 1) + (c == 'O' ? 1 : 0);
		}
		System.out.print(answer);
	}
}
