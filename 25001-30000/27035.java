import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] a = new int[n], b = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		for(int i = 0; i < n; i++) {
			b[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int answer = 0;
		for(int i = 0; i < n; i++) {
			answer += Math.abs(a[i] - b[i]);
		}
		System.out.print(answer);
	}
}
