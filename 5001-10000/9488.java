import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		long[] arr = new long[1000001];
		
		long num = 0;
		for(int i = 1; i < 1000001; i++) {
			arr[i] = arr[i - 1] + (num += i);
		}
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				break;
			}
			
			sb.append(arr[n]).append("\n");
		}
		System.out.print(sb);
	}
}
