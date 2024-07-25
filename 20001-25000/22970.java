import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int answer = 0;
		for(int i = 0; i < n; i++) {			
			int j = i;
			while(j + 1 < n && arr[j] < arr[j + 1]) {
				j++;
			}
			while(j + 1 < n && arr[j] > arr[j + 1]) {
				j++;
			}
			answer = Math.max(answer, j - i + 1);
		}
		System.out.print(answer);
	}
}
