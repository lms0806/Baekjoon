import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		System.out.print(solve(Integer.parseInt(br.readLine())));
	}
	
	public static int solve(int n) {
		if(n < 100) {
			return n;
		}
		
		int count = 99;
		if(n == 1000) {
			n = 999;
		}
		
		for(int i = 100; i <= n; i++) {
			int h = i / 100, t = (i / 10) % 10, o = i % 10;
			
			if(h - t == t - o) {
				count++;
			}
		}
		
		return count;
	}
}
