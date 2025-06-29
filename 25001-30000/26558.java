import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder answer = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());

			Stack<String> shirt = new Stack<>(), pants = new Stack<>(), socks = new Stack<>();
			while(n --> 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				StringBuilder sb = new StringBuilder();
				while(st.hasMoreTokens()) {
					String s = st.nextToken();
					
					if(s.contains("shirt")) {
						shirt.add(sb.toString().trim());
					}
					else if(s.contains("pants")) {
						pants.add(sb.toString().trim());
					}
					else if(s.contains("socks")) {
						socks.add(sb.toString().trim());
					}
					else {
						sb.append(s).append(" ");
					}
				}
			}
			
			int len = Math.min(Math.min(shirt.size(), pants.size()), socks.size());
			for(int i = 0; i < len; i++) {
				answer.append(shirt.pop()).append(", ").append(pants.pop()).append(", ").append(socks.pop()).append("\n");
			}
			answer.append("\n");
		}
		System.out.print(answer);
	}
}
