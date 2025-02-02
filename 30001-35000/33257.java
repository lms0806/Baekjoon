import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), e = Integer.parseInt(st.nextToken());
		
		int[] d = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			d[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(d);
		
		int answer = 1;
		for(int i = 1; i < n; i++) {
			if(d[i] - d[i - 1] >= e) {
				answer++;
			}
		}
		System.out.print(answer);
	}
}
