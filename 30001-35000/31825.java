import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		st.nextToken();
		int t = Integer.parseInt(st.nextToken());
		
		char[] c = br.readLine().toCharArray();
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int choice = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken()) - 1, r = Integer.parseInt(st.nextToken()) - 1;
			
			if(choice == 1) {
				char ch = c[l];
				int count = 1;
				for(int i = l + 1; i <= r; i++) {
					if(c[i] != ch) {
						ch = c[i];
						count++;
					}
				}
				sb.append(count).append("\n");
			}
			else {
				for(int i = l; i <= r; i++) {
					c[i]++;
					
					if(c[i] > 'Z') {
						c[i] = 'A';
					}
				}
			}
		}
		System.out.print(sb);
	}
}
