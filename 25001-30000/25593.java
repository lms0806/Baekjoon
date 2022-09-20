import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		HashMap<String, Integer> map = new HashMap<>();
		
		int[] arr = {4, 6, 4, 10};
		while(n --> 0) {
			for(int i = 0; i < 4; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j = 0; j < 7; j++) {
					String s = st.nextToken();
					
					if(!s.equals("-")) {
						map.put(s, map.containsKey(s) ? map.get(s) + arr[i] : arr[i]);
					}
				}
			}
		}
		
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for(String key : map.keySet()) {
			if(min > map.get(key)) {
				min = map.get(key);
			}
			
			if(max < map.get(key)) {
				max = map.get(key);
			}
		}
		
		System.out.print(max - min > 12 ? "No" : "Yes");
	}
}
