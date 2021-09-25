import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			
			if(n == 0 && m == 0) {
				break;
			}
			
			int[] num = new int[10001];
			
			int max = 0;
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < m; j++) {
					int count = Integer.parseInt(st.nextToken());
					
					num[count]++;
					if(max < num[count]) {
						max = num[count];
					}
				}
			}
			
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = max - 1; i >= 0; i--) {
				for(int j = 0; j < num.length; j++) {
					if(num[j] == i && num[j] != 0) {
						arr.add(j);
					}
				}
				if(arr.size() != 0) {
					break;
				}
			}
			
			Collections.sort(arr);
			
			for(int a : arr) {
				sb.append(a).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
