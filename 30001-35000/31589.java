import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		boolean flag = false;
		int s = 0, e = n - 1;
		long answer = 0, before = 0;
		while(k --> 0) {
			if(!flag) {
				answer += arr[e] - before;
				e--;
			}
			else {
				before = arr[s];
				s++;
			}
			
			flag = !flag;
		}
		System.out.print(answer);
	}
}
