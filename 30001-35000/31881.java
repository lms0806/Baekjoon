import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), q = Integer.parseInt(st.nextToken());
		
		int count = n;
		boolean[] flag = new boolean[n];
		StringBuilder sb = new StringBuilder();
		while(q --> 0) {
			st = new StringTokenizer(br.readLine());
			
			int choice = Integer.parseInt(st.nextToken());
			
			if(choice == 3) {
				sb.append(count).append("\n");
				continue;
			}
			
			int x = Integer.parseInt(st.nextToken()) - 1;
			
			if(choice == 1) {
				if(!flag[x]) {
					flag[x] = true;
					count--;
				}
			}
			else {
				if(flag[x]) {
					flag[x] = false;
					count++;
				}
			}
		}
		System.out.print(sb);
	}
}
