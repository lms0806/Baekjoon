import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i < t; i++) {
			String s = br.readLine();
			map.put(s, map.containsKey(s) ? map.get(s) + 1 : 1);
		}
		
		String answer = "NONE";
		for(String key : map.keySet()) {
			if(map.get(key) > t / 2) {
				answer = key;
				break;
			}
		}
		
		System.out.print(answer);
	}
}
