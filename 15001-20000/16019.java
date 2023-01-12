import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[5];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i < 5; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			arr[i] += arr[i - 1];
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				sb.append(Math.abs(arr[i] - arr[j])).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
