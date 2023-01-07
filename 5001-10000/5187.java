import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= size; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[n];
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}
			
			int sum = 0;
			while(m --> 0) {
				st = new StringTokenizer(br.readLine());
				sum += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()) * arr[Integer.parseInt(st.nextToken()) - 1];
			}
			sb.append("Data Set ").append(t).append(":\n").append(sum).append("\n");
		}
		System.out.print(sb);
	}
}
