import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int answer = 0;
		int check = Integer.parseInt(st.nextToken());
		for(int i = 1; i < n; i++) {
			if(check >= Integer.parseInt(st.nextToken())) {
				answer = i;
				break;
			}
		}
		
		System.out.print(answer == 0 ? "infinity" : answer);
	}
}
