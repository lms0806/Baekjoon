import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		System.out.print(solve(Integer.parseInt(br.readLine())));
	}
	
	public static int solve(int num) {
		if(num == 1) {
			return 1;
		}
		
		int a = 0, b = 1, c = 0;
		while(num --> 1) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}
}
