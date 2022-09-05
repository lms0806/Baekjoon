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
		
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0; i < m; i++) {
			set.add(Integer.parseInt(br.readLine()));
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			if(!set.contains(i)) {
				sb.append(i).append("\n");
			}
		}
		sb.append("Mario got ").append(set.size()).append(" of the dangerous obstacles.");
		System.out.print(sb);
	}
}
