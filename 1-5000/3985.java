import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int t = Integer.parseInt(br.readLine());
		
		int max = 0, idx = 0;
		int[] arr = new int[n + 1];
		for(int i = 1; i <= t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
			
			if(max < k - p) {
				max = k - p;
				idx = i;
			}
			
			for(int j = p; j <= k; j++) {
				if(arr[j] == 0) {
					arr[j] = i;
				}
			}
		}
		
		int count = 1, answer = 0, maxcount = 0;
		for(int i = 1; i < n; i++) {
			if(arr[i] != 0 && arr[i] == arr[i + 1]) {
				count++;
			}
			else {
				count = 1;
			}
			
			if(count > maxcount) {
				maxcount = count;
				answer = arr[i + 1];
			}
		}
		
		System.out.print(idx + "\n" + answer);
	}
}
