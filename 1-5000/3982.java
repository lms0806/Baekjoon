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
			HashMap<String, Integer> map = new HashMap<>();
			for(int i = 0; i < 16; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				String a = st.nextToken(), b = st.nextToken();
				int aa = Integer.parseInt(st.nextToken()), bb = Integer.parseInt(st.nextToken());
				
				if(aa > bb) {
					map.put(a, map.getOrDefault(a, 0) + 1);
				}
				else {
					map.put(b, map.getOrDefault(b, 0) + 1);
				}
			}
			
			int max = 0;
			String answer = null;
			for(String s : map.keySet()) {
				if(map.get(s) > max) {
					max = map.get(s);
					answer = s;
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
