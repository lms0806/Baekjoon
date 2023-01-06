import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int t = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int max = 0, min = n;
			
			for(int i = 0; i < n; i++) {
				for(char c : br.readLine().toCharArray()) {
					if(c == '#') {
						max = Math.max(max, n - i);
						min = Math.min(min, n - i);
					}
				}
			}
			
			sb.append(max - min).append("\n");
		}
		System.out.print(sb);
	}
}
