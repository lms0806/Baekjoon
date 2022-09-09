import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
 	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		HashMap<String, Integer> map = new HashMap<>();
		
		while(n --> 0) {
			String s = br.readLine();
			
			map.put(s, map.containsKey(s) ? map.get(s) + 1 : 1);
		}
		
		StringBuilder sb = new StringBuilder();
		for(String key : map.keySet()) {
			if(map.get(key) % m != 0) {
				sb.append(key).append("\n");
			}
		}
		System.out.print(sb);
	}
}
