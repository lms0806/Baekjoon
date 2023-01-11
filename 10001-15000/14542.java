import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = 1;
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				break;
			}
			
			int sum = 0;
			for(int i = 1; i <= n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				for(int j = 0; j < i; j++) {
					int num = Integer.parseInt(st.nextToken());
					
					if(i == n || j == 0 || j == i - 1) {
						sum += num;
					}
				}
			}
			
			sb.append("Case #").append(t).append(":").append(sum).append("\n");
			t++;
		}
		System.out.print(sb);
	}
}
