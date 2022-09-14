import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int w = Integer.parseInt(st.nextToken()), l = Integer.parseInt(st.nextToken()), num = Integer.parseInt(st.nextToken());
		
		HashMap<String, Integer> map = new HashMap<>();
		
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			map.put(st.nextToken(), st.nextToken().charAt(0) == 'W' ? w : -l);
		}
		
		int score = 0;
		while(n --> 0) {
			String s = br.readLine();
			
			if(!map.containsKey(s)) {
				score -= l;
				continue;
			}
			
			score += map.get(s);
			
			if(score < 0) {
				score = 0;
			}
			if(score >= num) {
				break;
			}
		}
		
		System.out.print(score >= num ? "I AM NOT IRONMAN!!" : "I AM IRONMAN!!");
	}
}
