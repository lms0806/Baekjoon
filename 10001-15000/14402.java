import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
 	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		HashMap<String, Integer> map = new HashMap<>();
		
		int answer = 0;
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			char c = st.nextToken().charAt(0);
			
			if(c == '+') {
				map.put(s, map.containsKey(s) ? map.get(s) + 1 : 1);
			}
			else {
				if(!map.containsKey(s) || map.get(s) == 0) {
					answer++;
				}
				else if(map.containsKey(s)) {
					map.put(s, map.get(s) - 1);
				}
			}
		}
		
		for(String s : map.keySet()) {
			answer += map.get(s);
		}
		System.out.print(answer);
	}
}
