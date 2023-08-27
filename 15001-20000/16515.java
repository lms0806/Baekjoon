import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		double start = 1;
		
		double answer = 1;
		for(int i = 1; i <= n; i++) {
			start *= i;
			answer += 1 / start;
		}
		System.out.print(answer);
	}
}
