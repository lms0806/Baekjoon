import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static Integer[] dp;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		int answer = 0;
		for(int i = 1; i * i <= n; i++) {
			if(n % i == 0) {
				answer += 2;
			}
			if(i * i == n) {
				answer--;
			}
		}
		System.out.print(answer);
	}
}
