import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int test = 1; test <= t; test++){
			int n = Integer.parseInt(br.readLine());
			
			int[] car = new int[n], rice = new int[n * 4];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				car[i] = Integer.parseInt(st.nextToken());
			}
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n * 4; i++) {
				rice[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(car);
			Arrays.sort(rice);
			
			int max = 0;
			for(int i = 0; i < n; i++) {
				max = Math.max(max, car[n - i - 1] + rice[i * 4 + 3]);
			}
			
			sb.append("Trip #").append(test).append(": "	).append(max).append("\n");
		}
		System.out.print(sb);
	}
}
