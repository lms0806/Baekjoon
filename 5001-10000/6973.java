import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int idx = 1;
			HashMap<String, Integer> map = new HashMap<>();
			while(true) {
				String s = br.readLine();
				
				if(s == null || s.length() == 0) {
					break;
				}
				
				StringTokenizer st = new StringTokenizer(s);
				
				while(st.hasMoreTokens()) {
					String str = st.nextToken();
					
					sb.append(map.containsKey(str) ? map.get(str) : str).append(" ");
					
					if(!map.containsKey(str)) {
						map.put(str, idx++);
					}
				}
				sb.append("\n");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
