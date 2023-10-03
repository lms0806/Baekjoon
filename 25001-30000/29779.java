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
			int[] arr = new int[26];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < 26; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int m = Integer.parseInt(br.readLine());
			
			boolean flag = false;
			HashSet<String> set = new HashSet<>();
			while(m --> 0) {
				StringBuilder s = new StringBuilder();
				for(char c : br.readLine().toCharArray()) {
					s.append(arr[c - 'A']);
				}
				
				if(set.contains(s.toString())) {
					flag = true;
				}
				
				set.add(s.toString());
			}
			
			sb.append("Case #").append(t).append(": ").append(flag ? "YES" : "NO").append("\n");
		}
		System.out.print(sb);
	}
}
