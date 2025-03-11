import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		Arrays.fill(arr, k);
		
		int answer = 0;
		while(true) {
			for(int i = 0; i < a; i++) {
				arr[i] += b;
			}
			
			for(int i = 0; i < n; i++) {
				arr[i]--;
			}
			
			Arrays.sort(arr);

			answer++;
			if(arr[0] == 0) {
				break;
			}
		}
		System.out.print(answer);
	}
}
