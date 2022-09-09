import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
 	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			HashMap<String, Integer> map = new HashMap<>();
			
			while(n --> 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String name = st.nextToken();
				int num = Integer.parseInt(st.nextToken());
				
				if(map.containsKey(name)) {
					if(map.get(name) > num) {
						map.put(name, num);
					}
				}
				else {
					map.put(name, num);
				}
			}
			
			ArrayList<Integer> arr = new ArrayList<>();
			for(String s : map.keySet()) {
				arr.add(map.get(s));
			}
			
			Collections.sort(arr);
			
			for(int a : arr) {
				sb.append(a).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
