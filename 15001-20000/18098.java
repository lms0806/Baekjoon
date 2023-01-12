import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		boolean[] check = new boolean[n + 1];
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(num <= n) {
				check[num] = true;
			}
		}
		
		int answer = 0;
		for(int i = 1; i <= n; i++) {
			if(check[i]) {
				answer++;
			}
		}
		System.out.print(answer);
	}
}
