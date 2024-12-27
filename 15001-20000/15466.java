import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			
			HashMap<Integer, Integer> map = new HashMap<>();
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				int num = Integer.parseInt(st.nextToken());
				
				map.put(num, map.getOrDefault(num, 0) + 1);
			}
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < m; i++) {
				int num = Integer.parseInt(st.nextToken());
				
				map.put(num, map.getOrDefault(num, 0) + 1);
			}
			
			double a = 0, b = map.size();
			for(int key : map.keySet()) {
				if(map.get(key) == 2) {
					a++;
				}
			}
			sb.append(a / b > 0.5 ? 1 : 0).append("\n");
		}
		System.out.print(sb);
	}
}
