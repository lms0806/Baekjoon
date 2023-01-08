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
			
			int[] arr = new int[n];
			
			int sum = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				int count = 0;
				for(int j = 0; j < i; j++) {
					if(arr[i] >= arr[j]) {
						count++;
					}
				}
				sum += count;
			}
			sb.append(sum).append("\n");
		}
		System.out.print(sb);
	}
}
