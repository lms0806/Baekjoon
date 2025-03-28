import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		long answer = Long.MAX_VALUE;
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long time = Integer.parseInt(st.nextToken());
			int check = Integer.parseInt(st.nextToken());
			
			if(check == 0) {
				answer = Math.min(answer, time);
			}
		}
		System.out.print(answer == Long.MAX_VALUE ? -1 : answer);
	}
}
