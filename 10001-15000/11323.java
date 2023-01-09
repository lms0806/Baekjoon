import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int[] arr = new int[6];
			for(int i = 0; i < 6; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int sum = 0, num = 0, idx = 0;
			while(num != n) {
				if(num + arr[idx] <= n) {
					num += arr[idx];
					sum += num;
				}
				
				idx++;
				if(idx == 6) {
					idx = 0;
				}
			}
			sb.append(sum).append("\n");
		}
		System.out.print(sb);
	}
}
