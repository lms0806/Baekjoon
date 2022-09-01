import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		HashSet<String> set = new HashSet<>();
		
		while(n --> 0) {
			set.add(br.readLine());
		}
		
		StringBuilder sb = new StringBuilder();
		while(m --> 0) {
			st = new StringTokenizer(br.readLine(), ",");
			while(st.hasMoreTokens()) {
				set.remove(st.nextToken());
			}
			sb.append(set.size()).append("\n");
		}
		System.out.print(sb);
	}
}
