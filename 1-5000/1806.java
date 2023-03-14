import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), s = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n + 1];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int l = 0, r = 0;
		int answer = Integer.MAX_VALUE, sum = arr[0];
		while(r < n) {
			if(sum >= s) {
				answer = Math.min(answer, r - l + 1);
				sum -= arr[l];
				l++;
			}
			else {
				r++;
				sum += arr[r];
			}
		}
		System.out.print(answer == Integer.MAX_VALUE ? 0 : answer);
	}
}
