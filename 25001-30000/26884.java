import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		HashMap<String, Integer> map = new HashMap<>();
		
		while(n --> 0) {
			String s = br.readLine();
			
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		
		int answer = 0;
		for(String key : map.keySet()) {
			if(map.get(key) > 1) {
				answer++;
			}
		}
		System.out.print(answer);
	}
}
