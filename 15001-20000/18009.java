import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= size; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			
			HashMap<String, Integer> map = new HashMap<>();
			
			while(n --> 0) {
				st = new StringTokenizer(br.readLine());
				
				map.put(st.nextToken(), Integer.parseInt(st.nextToken()));
			}
			
			int sum = 0, count = 0;
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				String s = st.nextToken();
				
				if(map.containsKey(s)) {
					sum += map.get(s);
					map.remove(s);
				}
				else {
					count++;
				}
			}
			
			ArrayList<Integer> arr = new ArrayList<>();
			for(String key : map.keySet()) {
				arr.add(map.get(key));
			}
			
			Collections.sort(arr);
			
			int min = sum, max = sum;
			for(int i = 0; i < count; i++) {
				min += arr.get(i);
			}
			
			for(int i = arr.size() - 1; i >= arr.size() - count; i--) {
				max += arr.get(i);
			}
			
			sb.append("Data Set ").append(t).append(":\n").append(min).append(" ").append(max).append("\n\n");
		}
		System.out.print(sb);
	}
}
