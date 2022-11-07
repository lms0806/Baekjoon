import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			
			if(n == 0) {
				break;
			}
			
			int p = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[3];
			
			if(p % 2 ==0) {
				arr[0] = p - 1;
				arr[1] = n - (p - 1);
				arr[2] = n - (p - 2);
			}
			else {
				arr[0] = p + 1;
				arr[1] = n - p;
				arr[2] = n - (p - 1);
			}
			
			Arrays.sort(arr);
			
			sb.append(arr[0]).append(" ").append(arr[1]).append(" ").append(arr[2]).append("\n");
		}
		System.out.print(sb);
	}
}
