import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= t; i++) {
			int n = Integer.parseInt(br.readLine());
			
			int[] num = new int[n];
			HashSet<Integer> set = new HashSet<>();
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				num[j] = Integer.parseInt(st.nextToken());
				set.add(num[j]);
			}
			
			sb.append("Case ").append(i).append(": ");
			for(int j = 0; j < n; j++) {
				if(!set.contains(num[j])) {
					continue;
				}
				
				set.remove(num[j]);
				
				if(set.isEmpty()) {
					sb.append(j + 1);
					break;
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}	
}
