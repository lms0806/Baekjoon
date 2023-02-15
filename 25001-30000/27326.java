import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n * 2 - 1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n * 2 - 1; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int answer = arr[n * 2 - 2];
		for(int i = 1; i < n * 2 - 1; i += 2) {
			if(arr[i] != arr[i - 1]) {
				answer = arr[i - 1];
				break;
			}
		}
		
		System.out.print(answer);
	}
}
