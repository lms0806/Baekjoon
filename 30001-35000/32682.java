import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			sb.append(solve(Integer.parseInt(br.readLine()))).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String solve(int n) {
		StringBuilder sb = new StringBuilder();
		if(n % 2 == 1) {
			sb.append("O");
		}
		
		if(Math.sqrt(n) == (int)(Math.sqrt(n))) {
			sb.append("S");
		}
		
		return sb.length() == 0 ? "EMPTY" : sb.toString();
	}
}
