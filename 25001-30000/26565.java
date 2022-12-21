import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), s = Integer.parseInt(st.nextToken());
			
			double[] arr = new double[n];
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				arr[i] = Double.parseDouble(st.nextToken());
			}
			
			Arrays.sort(arr);
			
			sb.append((int)Math.ceil(arr[arr.length - 1] * (s / 1000.0))).append("\n");
		}
		System.out.print(sb);
	}
}
