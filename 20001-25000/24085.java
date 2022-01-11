import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int[] n = new int[2001];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(t --> 0) {
			n[Integer.parseInt(st.nextToken())]++;
		}
		
		int answer = 0, max = Integer.MAX_VALUE;
		for(int i = 0; i < 2001; i++) {
			if(max > n[i] && n[i] != 0) {
				answer = i;
				max = n[i];
			}
		}
		System.out.print(answer);
	}
}
