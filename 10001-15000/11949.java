import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n + 5];
		for(int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 1; i <= m; i++) {
			for(int j = 1; j < n; j++) {
				if(arr[j] % i > arr[j + 1] % i) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= n; i++) {
			sb.append(arr[i]).append("\n");
		}
		System.out.print(sb);
	}
}
