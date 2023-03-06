import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int water = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n + 1];
		
		for(int i = 1; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			arr[a]++;
			arr[b]++;
		}
		
		double answer = 0;
		for(int i = 2; i <= n; i++) {
			if(arr[i] == 1) {
				answer++;
			}
		}
		
		System.out.print(water / answer);
	}
}
