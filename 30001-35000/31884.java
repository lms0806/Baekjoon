import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		HashMap<Integer, Integer> map = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int op = Integer.parseInt(st.nextToken()), x = Integer.parseInt(st.nextToken());
			
			if(op == 1) {
				int max = 0;
				for(int i = x; i < x + 4; i++) {
					max = Math.max(max, map.getOrDefault(i, 0));
				}
				
				for(int i = x; i < x + 4; i++) {
					map.put(i, max + 1);
				}
			}
			else if(op == 2) {				
				map.put(x, map.getOrDefault(x, 0) + 4);
			}
			else {
				sb.append(map.getOrDefault(x, 0)).append("\n");
			}
		}
		System.out.print(sb);
	}
}
