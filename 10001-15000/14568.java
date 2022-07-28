import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		System.out.print(solve(Integer.parseInt(br.readLine())));
	}
	
	public static int solve(int n) {
		int answer = 0;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i; j++) {
				for(int k = 2; k <= n - i - j; k += 2) {
					if(i >= j + 2 && i + j + k == n) {
						answer++;
					}
					if(i + j + k > n) {
						break;	
					}
				}
			}
		}
		return answer;
	}
}
