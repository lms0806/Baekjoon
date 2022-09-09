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
			br.readLine();
			br.readLine();
			
			HashSet<String> set = new HashSet<>();
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				set.add(st.nextToken());
			}
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				set.add(st.nextToken());
			}
			
			sb.append(set.size()).append("\n");
		}
		System.out.print(sb);
	}
}
