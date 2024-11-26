import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print(solve(Integer.parseInt(br.readLine())));
	}
	
	public static int solve(int n) {
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(n == i || n == j || n == i * j) {
					return 1;
				}
			}
		}
		return 0;
	}
}
