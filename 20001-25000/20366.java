import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int answer = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
            for (int j = i + 3; j < n; j++) {
				int s = i + 1, e = j - 1;
				
				int sum = arr[i] + arr[j];
				while(s < e) {
					int num = arr[s] + arr[e];
					
					answer = Math.min(answer, Math.abs(sum - num));
					
					if(num > sum) {
						e--;
					}
					else {
						s++;
					}
				}
			}
		}
		System.out.print(answer);
	}
}
