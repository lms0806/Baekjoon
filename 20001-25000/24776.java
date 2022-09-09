import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
 	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<String, Integer> map = new HashMap<>();
		
		int max = 0;
		String answer = "";
		while(true) {
			String s = br.readLine();
			
			if(s.equals("***")) {
				break;
			}
			
			map.put(s, map.containsKey(s) ? map.get(s) + 1 : 1);
			
			if(max < map.get(s) && map.get(s) >= 2) {
				max = map.get(s);
				answer = s;
			}
			else if(max == map.get(s)) {
				answer = "Runoff!";
			}
		}
		System.out.print(answer.equals("") ? "Runoff!" : answer);
	}
}
