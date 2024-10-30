import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= test; t++) {
			int n = Integer.parseInt(br.readLine()) << 1;
			
			int[] arr = new int[n];
			boolean[] check = new boolean[n];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			sb.append("Case #").append(t).append(": ");
			for(int i = 0; i < n; i++) {
				if(check[i]) {
					continue;
				}
				
				for(int j = i + 1; j < n; j++) {
					if(check[j]) {
						continue;
					}
					
					if(arr[i] / 3 * 4 == arr[j]) {
						sb.append(arr[i]).append(" ");
						check[i] = true;
						check[j] = true;
						break;
					}
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
