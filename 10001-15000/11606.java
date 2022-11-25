import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		int maxsafe = 1, minbreak = k;
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			
			int floor = Integer.parseInt(st.nextToken());
			String state = st.nextToken();
			
			if(state.equals("SAFE")) {
				maxsafe = Math.max(maxsafe, floor);
			}
			else {
				minbreak = Math.min(minbreak, floor);
			}
		}
		
		System.out.print(minbreak - maxsafe == 1 ? minbreak + " " + maxsafe : (maxsafe + 1) + " " + (minbreak - 1));
	}
}
