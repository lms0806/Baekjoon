import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print(solve(Integer.parseInt(br.readLine())));
	}
	
	public static int solve(int n) {
		if(n == 1 || n == 2) {
			return 4;
		}
		
		int num = (int) Math.round(Math.sqrt(n));
		
		return num * num >= n ? (num - 1) << 2 : ((num - 1) << 1) + (num << 1);
	}
}
