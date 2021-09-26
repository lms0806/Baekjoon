import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		System.out.print(solve(Integer.parseInt(br.readLine())));
	}
	
	public static int solve(int n) {
		for(int i = 1; i < n; i++) {
			int number = i, num = 0;
			
			while(number != 0) {
				num += number % 10;
				number /= 10;
			}
			
			if(num + i == n) {
				return i;
			}
		}
		return 0;
	}
}
