import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		br.readLine();
		
		StringBuilder sb = new StringBuilder();
		sb.append(t).append("\n\n");
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			int[] arr = new int[n];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr);
			
			int temp = arr[0];
			arr[0] = arr[1];
			arr[1] = temp;
			
			sb.append(n).append("\n");
			for(int a : arr) {
				sb.append(a).append(" ");
			}
			sb.append("\n\n");
			
			if(t > 0) {
				br.readLine();
			}
		}
		System.out.print(sb);
	}
}
