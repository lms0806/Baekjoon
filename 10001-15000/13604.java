import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int p = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[p];
		
		int max = 0;
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < p; j++) {
				arr[j] += Integer.parseInt(st.nextToken());
				
				max = Math.max(max, arr[j]);
			}
		}
		
		int answer = 0;
		for(int i = 0; i < p; i++) {
			if(arr[i] == max) {
				answer = i + 1;
			}
		}
		System.out.print(answer);
	}
}
