import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			int num = Integer.parseInt(st.nextToken());
			
			map.put(num, map.containsKey(num) ? map.get(num) + 1 : 1);
		}
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			for(Integer key : map.keySet()) {
				if(map.get(key) > 0) {
					map.put(key, map.get(key) - 1);
					sb.append(key).append(" ");
					k--;
					
					if(k == 0) {
						break;
					}
				}
			}
			if(k == 0) {
				break;
			}
		}
		System.out.print(sb);
	}
}
