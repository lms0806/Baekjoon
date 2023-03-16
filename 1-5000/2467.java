import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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
		
		Arrays.sort(arr);
		
		int s = 0, e = n - 1;
		int a = arr[s], b = arr[e];
		int min = Math.abs(arr[s] + arr[e]);
		
		while(s < e) {
			int num = arr[s] + arr[e];
			if(Math.abs(num) < min) {
				min = Math.abs(num);
				a = arr[s];
				b = arr[e];
			}
			
			if(num < 0) {
				s++;
			}
			else {
				e--;
			}
		}
		
		System.out.print(a + " " + b);
	}
}
