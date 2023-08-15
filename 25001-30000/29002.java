import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		int sum = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			sum += arr[i] = Integer.parseInt(st.nextToken());
		}
		
		sum >>= 1;
		
		StringBuilder sb = new StringBuilder();
		for(int a : arr) {
			if(a != sum) {
				sb.append(a).append(" ");
			}
		}
		System.out.print(sb.toString() + sum);
	}
}
