import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= n; i++) {
			int size = Integer.parseInt(br.readLine());
			
			long[] arr = new long[size], arr1 = new long[size];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < size; j++) {
				arr[j] = Long.parseLong(st.nextToken());
			}
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < size; j++) {
				arr1[j] = Long.parseLong(st.nextToken());
			}
			
			Arrays.sort(arr);
			Arrays.sort(arr1);
			
			long answer = 0;
			for(int j = 0; j < size; j++) {
				answer += arr[j] * arr1[size - j - 1];
			}
			sb.append("Case #").append(i).append(": ").append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
