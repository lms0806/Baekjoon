import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n + 1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[Integer.parseInt(st.nextToken())]++;
		}
		
		boolean flag = false;
		int max = 0, answer = 0;
		for(int i = 1; i <= n; i++) {
			if(arr[i] > max) {
				max = arr[i];
				answer = i;
				flag = false;
			}
			else if(arr[i] == max) {
				flag = true;
			}
		}
		System.out.print(flag ? "skipped" : answer);
	}
}
