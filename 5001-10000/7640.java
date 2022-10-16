import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int t = Integer.parseInt(br.readLine());
			
			if(t == 0) {
				break;
			}
			
			HashMap<Integer, Integer> map = new HashMap<>();
			
			while(t --> 0) {
				int n = Integer.parseInt(br.readLine());
				
				map.put(n, map.containsKey(n) ? map.get(n) + 1 : 1);
			}
			
			int answer = 0;
			for(Integer key : map.keySet()) {
				answer = Math.max(answer, map.get(key));
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
