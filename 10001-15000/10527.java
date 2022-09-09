import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
 	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			
			map.put(s, map.containsKey(s) ? map.get(s) + 1 : 1);
		}
		
		int answer = 0;
		while(n --> 0) {
			String s = br.readLine();
			
			if(map.containsKey(s) && map.get(s) != 0) {
				map.put(s, map.get(s) - 1);
				answer++;
			}
		}
		System.out.print(answer);
	}
}
