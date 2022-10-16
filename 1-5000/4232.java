import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int t = Integer.parseInt(br.readLine());
			
			if(t == 0) {
				break;
			}
			
			HashMap<String, Integer> map = new HashMap<>();
			
			while(t --> 0) {
				StringBuilder s = new StringBuilder();
				StringTokenizer st = new StringTokenizer(br.readLine());
				int[] num = new int[5];
				for(int i = 0; i < 5; i++) {
					num[i] = Integer.parseInt(st.nextToken());
				}
				
				Arrays.sort(num);
				
				for(int n : num) {
					s.append(n);
				}
				
				map.put(s.toString(), map.containsKey(s.toString()) ? map.get(s.toString()) + 1 : 1);
			}
			
			int answer = 0, max = 0;
			for(String key : map.keySet()) {
				if(map.get(key) > max) {
					max = map.get(key);
					answer = map.get(key);
				}
				else if(map.get(key) == max) {
					answer += map.get(key);
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
