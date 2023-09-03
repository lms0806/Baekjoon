import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				break;
			}
			
			int min = Integer.MAX_VALUE, answer = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 1; i <= n; i++) {
				int num = Integer.parseInt(st.nextToken());
				
				if(min > Math.abs(num - 2023)) {
					min = Math.abs(num - 2023);
					answer = i;
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
