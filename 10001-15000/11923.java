import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int answer = 0;
		for(int i = 0; i < n; i++) {
			int sum = 0, count = 0;
			for(int j = i; j < n; j++) {
				if(sum + arr[j] <= c) {
					sum += arr[j];
					count++;
				}
			}
			answer = Math.max(answer, count);
		}
		System.out.print(answer);
	}
}
