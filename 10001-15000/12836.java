import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		long[] num = new long[n+1];
		
		int check, p, q;
		StringBuilder sb = new StringBuilder();
		while(m-->0) {
			st = new StringTokenizer(br.readLine());
			check = Integer.parseInt(st.nextToken());
			p = Integer.parseInt(st.nextToken());
			q = Integer.parseInt(st.nextToken());
			
			if(check == 1) {
				num[p] += q;
			}
			else if(check == 2){
				long answer = 0;
				for(int j = p; j < q+1; j++) {
					answer += num[j];
				}
				sb.append(answer).append("\n");
			}
		}
		
		System.out.print(sb);
	}
}
