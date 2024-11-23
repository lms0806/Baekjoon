import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		long[][] arr = new long[n][2];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 2; j++) {
				arr[i][j] = Long.parseLong(st.nextToken());
			}
		}
		
		long answer = 0;
		for(int i = 0; i < n - 2; i++) {
			for(int j = i + 1; j < n - 1; j++) {
				for(int k = j + 1; k < n; k++) {
					long a = solve(arr[i][0], arr[j][0], arr[i][1], arr[j][1]);
					long b = solve(arr[i][0], arr[k][0], arr[i][1], arr[k][1]);
					long c = solve(arr[j][0], arr[k][0], arr[j][1], arr[k][1]);
					
					if(a + b == c || a + c == b || b + c == a) {
						answer++;
					}
				}
			}
		}
		System.out.print(answer);
	}
	
	public static long solve(long x1, long x2, long y1, long y2) {
		return (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
	}
}
