import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringBuilder sb = new StringBuilder();
		int count = 0;
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int o = Integer.parseInt(st.nextToken()), w = Integer.parseInt(st.nextToken());
			
			if(o == 0 && w == 0) {
				break;
			}
			
			boolean flag = true;
			while(true) {
				st = new StringTokenizer(br.readLine());
				char action = st.nextToken().charAt(0);
				int n = Integer.parseInt(st.nextToken());
				
				if(action == '#' && n == 0) {
					break;
				}
				
				if(flag) {
					if(action == 'E') {
						w -= n;
					}
					else if(action == 'F') {
						w += n;
					}
				}
				
				if(w <= 0) {
					flag = false;
				}
			}
			count++;
			
			sb.append(count).append(" ").append(w <= 0 ? "RIP" : o / 2 < w && w < o * 2 ? ":-)" : ":-(").append("\n");
		}
		System.out.print(sb);
	}
}
