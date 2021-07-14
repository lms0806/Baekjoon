import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Long.parseLong(st.nextToken()), b = Long.parseLong(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		if(a == b) {
			sb.append(0);
		}
		else {
			sb.append(Math.max(a, b) - Math.min(a, b) - 1).append("\n");
			for(long i = Math.min(a, b) + 1; i < Math.max(a, b); i++) {
				sb.append(i).append(" ");
			}
		}
		System.out.print(sb);
	}
}
