import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			for(int i = 1; i < 8; i++) {
				n = solve(n, i);
			}
			sb.append(n).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int solve(int n, int count) {
		if(n > Math.pow(10, count)) {
			n =  (n + 5 * (int)Math.pow(10, count - 1)) / (int)Math.pow(10, count) * (int)Math.pow(10, count);
		}
		return n;
	}
}
