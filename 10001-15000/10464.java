import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			sb.append(solve(Long.parseLong(st.nextToken()) - 1) ^ solve(Long.parseLong(st.nextToken()))).append("\n");
		}
		System.out.print(sb);
	}
	
	public static long solve(long n) {
		long mod = n % 4;
		
		return mod == 0 ? n : mod == 1 ? 1 : mod == 2 ? n + 1 : 0; 
	}
}
