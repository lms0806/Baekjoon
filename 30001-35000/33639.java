import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		HashMap<String, ArrayList<String>> map = new HashMap<>();
		while(n --> 0) {
			String str = br.readLine();
			StringBuilder sb = new StringBuilder();
			for(String s : str.split(" ")) {
				sb.append(s.charAt(0));
			}
			
			if(!map.containsKey(sb.toString())) {
				map.put(sb.toString(), new ArrayList<>());
			}
			
			map.get(sb.toString()).add(str);
		}
		
		StringBuilder answer = new StringBuilder();
		while(m --> 0) {
			String s = br.readLine();
			
			answer.append(!map.containsKey(s) ? "nobody" : map.get(s).size() > 1 ? "ambiguous" : map.get(s).get(0)).append("\n");
		}
		System.out.print(answer);
	}
}
