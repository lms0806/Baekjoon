import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			HashSet<String> set = new HashSet<>();
			while(n --> 0) {
				set.add(br.readLine().toLowerCase());
			}
			
			int count = 0, total = 0;
			n = Integer.parseInt(br.readLine());
			while(n --> 0) {
				String str = br.readLine().toLowerCase().replaceAll("[^a-z]", " ").replaceAll("\\s+", " ");
				
				StringTokenizer st = new StringTokenizer(str);
				while(st.hasMoreTokens()) {
					if(set.contains(st.nextToken())) {
						count++;
					}
					total++;
				}
			}
			
			sb.append(count * 100 / total >= 75.0 ? "It's a hit!" : "Delete immediately!").append("\n");
		}
		System.out.print(sb);
	}
}
