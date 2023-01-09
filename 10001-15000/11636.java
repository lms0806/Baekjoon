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
			
			int sum = 0, n = Integer.parseInt(st.nextToken()) * 2;
			while(st.hasMoreTokens()) {
				int num = Integer.parseInt(st.nextToken());
				
				if(num == 0) {
					break;
				}
				
				if(num > n) {
					sum += num - n;
				}
				
				n = num * 2;
			}
			sb.append(sum).append("\n");
		}
		System.out.print(sb);
	}
}
