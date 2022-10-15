import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			
			HashMap<String, Integer> map = new HashMap<>();
			while(n --> 0) {
				map.put(br.readLine(), 0);
			}
			
			while(m --> 0) {
				st = new StringTokenizer(br.readLine());
				String s = st.nextToken();
				map.put(s, map.get(s) + Integer.parseInt(st.nextToken()));
			}
			
			int max = Integer.MIN_VALUE;
			String winner = "";
			for(String s : map.keySet()) {
				int votes = map.get(s);
				
				if(votes > max) {
					max = votes;
					winner = s;
				}
				else if(votes == max) {
					winner = "";
				}
			}
			
			sb.append("VOTE ").append(i).append(": ");
			sb.append(winner.equals("") ? "THERE IS A DILEMMA" : "THE WINNER IS " + winner + " " + max).append("\n");
		}
		System.out.print(sb);
	}
}
