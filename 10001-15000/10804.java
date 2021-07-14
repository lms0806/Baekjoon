import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] a = new int[20];
		int[] b = new int[20];
		
		for(int i = 0; i < 20; i++) {
			a[i] = i + 1;
		}
		
		for(int i = 0; i < 10; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			
			int count = 1;
			for(int j = n - 1; j < m; j++) {
				b[j] = a[m - count];
				count++;
			}
			
			for(int j = n - 1; j < m; j++) {
				a[j] = b[j];
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < a.length; i++) {
			sb.append(a[i]).append(" ");
		}
		System.out.print(sb);
	}
}
