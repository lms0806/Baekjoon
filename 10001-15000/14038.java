import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = 0;
		for(int i = 0; i < 6; i++) {
			if(br.readLine().charAt(0) == 'W') {
				n++;
			}
		}
		System.out.print(solve(n));
	}
	
	public static int solve(int n) {
		return n == 5 || n == 6 ? 1 : n == 3 || n == 4 ? 2 : n == 1 || n == 2 ? 3 : -1;
	}
}
