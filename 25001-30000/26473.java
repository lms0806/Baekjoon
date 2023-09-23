import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				break;
			}
			
			int[] arr = new int[n];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr);
			
			int count = 1;
			int answer = 1, num = arr[0];
			for(int i = 1; i < n; i++) {
				if(num + 1 == arr[i]) {
					count++;
				}
				else {
					answer = Math.max(answer, count);
					count = 1;
				}
				num = arr[i];
			}
			sb.append(Math.max(answer, count)).append("\n");
		}
		System.out.print(sb);
	}
}
