import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
 	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long[] a = new long[3], b = new long[3];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 3; i++) {
			a[i] = Long.parseLong(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 3; i++) {
			b[i] = Long.parseLong(st.nextToken());
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		long answer = 0;
		for(int i = 0; i < 3; i++) {
			answer += a[i] * b[i];
		}
		System.out.print(answer);
	}
}
