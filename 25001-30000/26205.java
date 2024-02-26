import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if(map.containsKey(num + 1)) {
				if(map.get(num + 1) == 1) {
					map.remove(num + 1);
				}
				else {
					map.put(num + 1, map.get(num + 1) - 1);
				}
				map.put(num, map.getOrDefault(num, 0) + 1);
			}
			else {
				map.put(num, map.getOrDefault(num, 0) + 1);
			}
		}
		
		int answer = 0;
		for(Integer key : map.keySet()) {
			answer += map.get(key);
		}
		System.out.print(answer);
	}
}
