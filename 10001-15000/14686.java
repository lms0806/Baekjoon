import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		int[] a = new int[n], b = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		
		int asum = 0, bsum = 0, answer = 0;
		for(int i = 0; i < n; i++) {
			asum += a[i];
			bsum += b[i];
			
			if(asum == bsum) {
				answer = i + 1;
			}
		}
		
		System.out.print(answer);
	}
}
