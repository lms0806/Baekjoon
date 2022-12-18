import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			TreeMap<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
			
			while(n --> 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				String name = st.nextToken();
				int num = Integer.parseInt(st.nextToken());
				
				map.put(num, name);
			}
			
			int idx = 0;
			for(Integer key : map.keySet()) {
				sb.append(map.get(key));
				
				idx++;
				if(idx < map.size()) {
					sb.append(", ");
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
