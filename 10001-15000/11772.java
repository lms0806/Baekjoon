import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int answer = 0;
		
		int t = Integer.parseInt(br.readLine());
		
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			answer += Math.pow(n / 10, n % 10);
		}
		System.out.print(answer);
	}
}
