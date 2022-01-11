import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}
		
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			arr[Integer.parseInt(st.nextToken()) - 1] = Integer.parseInt(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		for(int a : arr) {
			sb.append(a).append("\n");
		}
		System.out.print(sb);
	}
}
