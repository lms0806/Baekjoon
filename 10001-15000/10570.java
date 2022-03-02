import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int[] arr = new int[1001];
			
			int n = Integer.parseInt(br.readLine());
			
			for(int i = 0; i < n; i++) {
				arr[Integer.parseInt(br.readLine())]++;
			}
			
			int answer = 0, count = 0;
			for(int i = 1000; i >= 1; i--) {
				if(count <= arr[i]) {
					answer = i;
					count = arr[i];
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.println(sb);
	}
}
