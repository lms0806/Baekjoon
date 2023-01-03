import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= t; i++) {
			int n = Integer.parseInt(br.readLine());
			
			double[] arr = new double[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				arr[j] = Double.parseDouble(st.nextToken());
			}
			
			for(int j = 1; j < n - 1; j++) {
				if(arr[j] > (arr[j - 1] + arr[j + 1]) / 2) {
					arr[j] = (arr[j - 1] + arr[j + 1]) / 2;
				}
			}
			
			sb.append("Case #").append(i).append(": ").append(String.format("%.6f", arr[n - 2])).append("\n");
		}
		System.out.print(sb);
	}
}
