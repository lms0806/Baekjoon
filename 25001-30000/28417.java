import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		int max = 0;
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int sum = Math.max(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			
			int[] arr = new int[5];
			for(int i = 0; i < 5; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr);
			
			max = Math.max(max, sum + arr[arr.length - 1] + arr[arr.length - 2]);
		}
		System.out.print(max);
	}
}
