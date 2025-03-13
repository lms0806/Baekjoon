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
			char ch = 'a';
			StringBuilder sb = new StringBuilder();
			HashMap<Character, Character> charMap = new HashMap<>();
			for(char c : br.readLine().toCharArray()) {
				if(!charMap.containsKey(c)) {
					charMap.put(c, ch++);
				}
				sb.append(charMap.get(c));
			}
			map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + 1);
		}
		
		int answer = 0;
		for(String key : map.keySet()) {
			if(map.get(key) > 1) {
				answer += map.get(key) * (map.get(key) - 1) / 2;
			}
		}
		System.out.print(answer);
	}
}
