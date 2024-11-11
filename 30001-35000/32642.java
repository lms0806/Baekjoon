import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		long answer = 0, num = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			int t = Integer.parseInt(st.nextToken());
			
			num += t == 1 ? 1 : -1;
			
			answer += num;
		}
		System.out.print(answer);
	}
}
