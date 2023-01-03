import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			
			double sum = 0;
			
			double[] arr = new double[n];
			for(int i = 0; i < n; i++) {
				arr[i] = Double.parseDouble(st.nextToken());
				sum += arr[i];
			}
			
			double count = 0;
			for(int i = 0; i < n; i++) {
				if(arr[i] > sum / n) {
					count++;
				}
			}
			
			sb.append(print(sum / n)).append(" ").append(print((double)(count / n * 100.0))).append("%").append("\n");
		}
		System.out.print(sb);
	}
	
	public static String print(double n) {
		return String.format("%.3f", n);
	}
}
