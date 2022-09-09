import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
 	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		HashMap<String, Integer> map = new HashMap<>();
		
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			map.put(st.nextToken(), Integer.parseInt(st.nextToken()));
		}
		
		StringBuilder sb = new StringBuilder();
		while(m --> 0) {
			int answer = 0;
			while(true) {
				String s = br.readLine();
				
				if(s.equals(".")) {
					break;
				}
				
				String[] str = s.split(" ");
				for(int i = 0; i < str.length; i++) {
					if(map.containsKey(str[i])) {
						answer += map.get(str[i]);
					}
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
