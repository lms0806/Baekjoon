import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		int s = 0, e = 0;
		int answer = Integer.MAX_VALUE;
		while(s < n && e < n) {
			int num = arr[e] - arr[s];
			if(num < m) {
				e++;
			}
			else {
				answer = Math.min(answer, num);
				s++;
			}
		}
		System.out.print(answer);
	}
}
