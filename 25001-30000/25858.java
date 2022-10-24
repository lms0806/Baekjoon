import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
		
		int sum = 0;
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			sb.append(d * arr[i] / sum).append("\n");
		}
		System.out.print(sb);
	}
}
