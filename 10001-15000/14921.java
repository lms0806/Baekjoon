import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int s = 0, e = n - 1;
		int answer = arr[s] + arr[e];
		while(s < e) {
			int sum = arr[s] + arr[e];
			if(Math.abs(answer) > Math.abs(sum)) {
				answer = arr[s] + arr[e];
			}
			
			if(sum < 0) {
				s++;
			}
			else {
				e--;
			}
		}
		System.out.print(answer);
	}
}
