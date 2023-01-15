import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		HashMap<String, Integer> map = new HashMap<>();
		while(n --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String name = st.nextToken();
			int num = Integer.parseInt(st.nextToken());
			
			map.put(name, map.getOrDefault(name, 0) + num);
		}
		
		String answer = "NO";
		for(String key : map.keySet()) {
			if(map.get(key) == 5) {
				answer= "YES";
				break;
			}
		}
		System.out.print(answer);
	}
}
