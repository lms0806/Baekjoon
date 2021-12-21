import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[] bulb = new int[n + 1];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i < n; i++) {
			bulb[i] = Integer.parseInt(st.nextToken());
		}
		
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
			
			if(a == 1) {
				bulb[b] = c;
			}
			else if(a == 2) {
				for(int i = b; i <= c; i++) {
					bulb[i] = bulb[i] == 1 ? 0 : 1;
				}
			}
			else if(a == 3) {
				for(int i = b; i <= c; i++) {
					bulb[i] = 0;
				}
			}
			else {
				for(int i = b; i <= c; i++) {
					bulb[i] = 1;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i < bulb.length; i++) {
			sb.append(bulb[i]).append(" ");
		}
		System.out.print(sb);
	}
}
