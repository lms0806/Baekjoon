import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), q = Integer.parseInt(st.nextToken());
		
		int[] num = new int[n + 1];
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		while(q --> 0) {
			st = new StringTokenizer(br.readLine());
			int check = Integer.parseInt(st.nextToken());
			
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			long answer = 0;
			for(int i = a; i <= b; i++) {
				answer += num[i];
			}
			
			if(check == 1) {
				sb.append(answer);
				
				int temp = num[a];
				num[a] = num[b];
				num[b] = temp;
			}
			else {
				int c = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
				
				for(int i = c; i <= d; i++) {
					answer -= num[i];
				}
				sb.append(answer);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
