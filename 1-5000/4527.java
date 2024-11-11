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
			int n = Integer.parseInt(br.readLine());
			
			int sum = 0;
			for(int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				sum += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
			}
			
			int num = 36 * 36;
			for(int i = 1; i <= 3; i++) {
				sb.append(num * i / sum).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
