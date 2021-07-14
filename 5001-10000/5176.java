import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int p = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			
			int[] num = new int[m];
			
			int answer = 0;
			while(p --> 0) {
				int n = Integer.parseInt(br.readLine());
				if(num[n - 1] == 1) {
					answer++;
				}
				else {
					num[n - 1]++;
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
