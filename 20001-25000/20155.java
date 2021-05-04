import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		int[] num = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			num[Integer.parseInt(st.nextToken())-1]++;
		}
		
		int max = 0;
		for(int i = 0; i < n; i++) {
			max = Math.max(num[i], max);
		}
		System.out.print(max);
	}
}
