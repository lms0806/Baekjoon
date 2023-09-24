import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= size; t++) {
			int n = Integer.parseInt(br.readLine());
			
			HashSet<Integer> set = new HashSet<>();
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(n --> 0) {
				int num = Integer.parseInt(st.nextToken());
				
				if(set.contains(num)) {
					set.remove(num);
				}
				else {
					set.add(num);
				}
			}
			
			sb.append("Case #").append(t).append(": ").append(set.iterator().next()).append("\n");
		}
		System.out.print(sb);
	}
}
