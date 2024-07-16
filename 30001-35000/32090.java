import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				break;
			}
			
			int idx = 0;
			ArrayList<Character> arr = new ArrayList<>();
			while(n --> 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String s = st.nextToken();
				char c = st.nextToken().charAt(0);
				
				if(s.equals("INSERT")) {
					arr.add(idx++, c);
				}
				else if(s.equals("LEFT")) {
					idx = Math.max(idx - 1, 0);
				}
				else {
					idx = Math.min(idx + 1, arr.size());
				}
			}
			
			for(char c : arr) {
				sb.append(c);
			}
			
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
