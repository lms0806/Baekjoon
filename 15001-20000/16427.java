import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), s = Integer.parseInt(st.nextToken());
		int max = 0;
		
		st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			max = Math.max(max, Integer.parseInt(st.nextToken()));
		}
		
		System.out.print((1L * max * s + 999) / 1000);
	}
}
