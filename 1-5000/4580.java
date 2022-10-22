import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder answer = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int t = Integer.parseInt(st.nextToken());
			
			if(t == 0) {
				break;
			}
			
			int idx = 1, before = 0;
			StringBuilder sb = new StringBuilder();
			while(t --> 0) {
				int n = Integer.parseInt(st.nextToken());
				
				sb.append((idx + " ").repeat(n - before));
				
				idx++;
				before = n;
			}
			answer.append(sb).append("\n");
		}
		System.out.print(answer);
		
	}
}
