import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[] num = new int[m];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				if(Integer.parseInt(st.nextToken()) == 1) {
					num[j]++;
				}
			}
		}
		
		int max = n;
		StringBuilder sb = new StringBuilder();
		while(max != 0) {
			for(int i = 0; i < m; i++) {
				if(max == num[i]) {
					sb.append(i + 1).append(" ");
				}
			}
			max--;
		}
		System.out.print(sb);
	}
}
