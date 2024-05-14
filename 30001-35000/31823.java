import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int t = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
		
		HashSet<Integer> set = new HashSet<>();
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int num = 0, max = 0;
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				if(st.nextToken().charAt(0) == '.') {
					num++;
					max = Math.max(max, num);
				}
				else {
					num = 0;
				}
			}
			
			set.add(max);
			
			sb.append(max).append(" ").append(st.nextToken()).append("\n");
		}
		System.out.print(set.size() + "\n" + sb);
	}
}
