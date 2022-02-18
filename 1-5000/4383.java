import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		StringBuilder sb = new StringBuilder();
		while((str = br.readLine()) != null){
			StringTokenizer st = new StringTokenizer(str);
			
			int n = Integer.parseInt(st.nextToken());
			
			if(n == 1) {
				sb.append("Jolly");
			}
			else {
				int[] arr = new int[n];
				for(int i = 0; i < n; i++) {
					arr[i] = Integer.parseInt(st.nextToken());
				}
				
				sb.append(solve(arr));
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
	
	public static String solve(int[] arr) {
		int[] cost = new int[arr.length - 1];
		
		for(int i = 0; i < arr.length - 1; i++) {
			cost[i] = Math.abs(arr[i] - arr[i + 1]);
		}
		
		Arrays.sort(cost);
		
		for(int i = 0; i < cost.length; i++) {
			if(cost[i] != i + 1) {
				return "Not jolly";
			}
		}
		return "Jolly";
	}
}
