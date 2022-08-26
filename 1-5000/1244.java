import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n + 1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int t = Integer.parseInt(br.readLine());
		
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int male = Integer.parseInt(st.nextToken()), which = Integer.parseInt(st.nextToken());
			
			if(male == 1) {
				for(int i = which; i <= n; i += which) {
					arr[i] ^= 1;
				}
			}
			else {
				int a = which - 1, b = which + 1;
				while(true) {
					if(a < 1 || b >= n + 1 || arr[a] != arr[b]) {
						break;
					}
					a--;
					b++;
				}
				a++;
				b--;
				
				while(a <= b) {
					arr[a] ^= 1;
					a++;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i < arr.length; i++) {
			sb.append(arr[i]).append(" ");
			if(i % 20 == 0) {
				sb.append("\n");
			}
		}
		System.out.print(sb);
	}
}
