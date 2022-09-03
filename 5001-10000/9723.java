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
		for(int i = 1; i <= t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int[] arr = new int[3];
			for(int j = 0; j < 3; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr);
			
			sb.append("Case #").append(i).append(": ");
			if(arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2]) {
				sb.append("YES");
			}
			else {
				sb.append("NO");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
