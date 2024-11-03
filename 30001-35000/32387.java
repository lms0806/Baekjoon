import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n + 1];
		TreeSet<Integer> set = new TreeSet<>();

		for(int i = 1; i <= n; i++) {
			set.add(i);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= m; t++) {
			st = new StringTokenizer(br.readLine());
			
			int choice = Integer.parseInt(st.nextToken()), idx = Integer.parseInt(st.nextToken());
			
			if(choice == 1) {
				Integer num = set.ceiling(idx);
				
				if(num == null) {
					sb.append(-1);
				}
				else {
					set.remove(num);
					arr[num] = t;
					sb.append(num);
				}
			}
			else {
				if(arr[idx] == 0) {
					sb.append(-1);
				}
				else {
					sb.append(arr[idx]);
					arr[idx] = 0;
					set.add(idx);
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
