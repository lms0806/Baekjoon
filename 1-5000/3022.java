import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<String, Integer> map = new HashMap<>();
		
		int t = Integer.parseInt(br.readLine());
		
		int answer = 0;
		while(t --> 0) {
			String s = br.readLine();
			
			map.put(s, map.containsKey(s) ? map.get(s) + 1 : 1);
			
			int num = map.get(s), sum = 0;
			for(String key : map.keySet()) {
				if(!key.equals(s)) {
					sum += map.get(key);
				}
			}
			
			if(sum + 1 < num) {
				answer++;
			}
		}
		System.out.print(answer);
	}
}
