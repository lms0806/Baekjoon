import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int count = 0, answer = 0, num = 0;
		for(int i = 0; i < n; i++) {
			if(count == 0) {
				num = arr[i];
			}
			
			count++;
			
			if(count == num) {
				count = 0;
				answer++;
			}
		}
		System.out.print(answer + (count != 0 ? 1 : 0));
	}
}
