import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(solve(Integer.parseInt(br.readLine())));
	}
	
	public static String solve(int n) {
		for(int i = 2; i * i <= n; i++) {
			if(n % i == 0) {
				return "No";
			}
		}
		return "Yes";
	}
}
