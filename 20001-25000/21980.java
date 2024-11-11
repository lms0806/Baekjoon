import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			
			HashMap<String, Integer> map = new HashMap<>();
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				String s = st.nextToken();
				
				int count = 0;
				for(char c : s.toCharArray()) {
					if('A' <= c && c <= 'Z') {
						count++;
					}
				}
				
				char[] ch = s.toLowerCase().toCharArray();
				
				Arrays.sort(ch);
				
				map.put(new String(ch) + count, map.getOrDefault(new String(ch) + count, 0) + 1);
			}
			
			int answer = 0;
			for(String s : map.keySet()) {
				answer += (map.get(s) * (map.get(s) - 1)) >> 1;
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
