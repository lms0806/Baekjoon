import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		int[] sum = new int[size + 1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= size; i++) {
			sum[i] = Integer.parseInt(st.nextToken()) + sum[i - 1];
		}
		
		size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()) - 1;
			
			sb.append(sum[Integer.parseInt(st.nextToken())] - sum[a]).append("\n");
		}
		System.out.print(sb);
	}
}
