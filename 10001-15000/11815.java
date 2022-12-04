import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(t --> 0) {
			long n = Long.parseLong(st.nextToken());
			
			long num = (long)Math.sqrt(n);
			
			sb.append(num * num == n ? 1 : 0).append(" ");
		}
		System.out.print(sb);
	}
}
