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
			long[][] n = new long[4][2];
			for(int i = 0; i < 4; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				n[i][0] = Long.parseLong(st.nextToken());
				n[i][1] = Long.parseLong(st.nextToken());
			}
			
			double[] arr = new double[6];
			int k = 0;
			for(int i = 0; i < 3; i++) {
				for(int j = i + 1; j < 4; j++) {
					arr[k++] = Math.sqrt(Math.pow(n[i][0] - n[j][0], 2) + Math.pow(n[i][1] - n[j][1], 2));
				}
			}
			
			Arrays.sort(arr);
			
			sb.append(arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == arr[3] && arr[4] == arr[5] ? 1 : 0).append("\n");
		}
		System.out.print(sb);
	}
}
