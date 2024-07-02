import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		long[][] arr = new long[n][3];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 3; j++) {
				arr[i][j] = Long.parseLong(st.nextToken());
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long x = Long.parseLong(st.nextToken()), y = Long.parseLong(st.nextToken()), z = Long.parseLong(st.nextToken());
			long r = Long.parseLong(st.nextToken());
			
			long pow = r * r;
			int count = 0;
			for(int i = 0; i < n; i++) {
				if(check(arr[i], x, y, z) <= pow) {
					count++;
				}
			}
			sb.append(count).append("\n");
		}
		System.out.print(sb);
	}
	
	public static long check(long[] arr, long x, long y, long z) {
		long a = arr[0] - x, b = arr[1] - y, c = arr[2] - z;
		
		return a * a + b * b + c * c;
	}
}
