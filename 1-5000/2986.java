import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		int answer = 1;
		for(int i = 2; i*i <= n; i++) {
			if(n%i == 0) {
				answer = n/i;
				break;
			}
		}
		System.out.print(n-answer);
	}
}
