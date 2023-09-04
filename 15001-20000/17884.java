import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		arr[0] = 1;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i < n; i++) {
			arr[Integer.parseInt(st.nextToken()) + 1] = i + 1;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int a : arr) {
			sb.append(a).append(" ");
		}
		System.out.print(sb);
	}
}
