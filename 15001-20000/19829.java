import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int l = 0;
		int answer = 1, now = arr[0];
		for(int i = 1; i < n; i++) {
			if(now == arr[i]) {
				l = i;
			}
			
			answer = Math.max(answer, i - l + 1);
			now = arr[i];
		}
		System.out.print(answer);
	}
}
