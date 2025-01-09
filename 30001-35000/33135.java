import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(char c : br.readLine().toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		
		int answer = 0;
		for(char key : map.keySet()) {
			answer += map.get(key) - 1;
		}
		System.out.print(answer);
	}
}
