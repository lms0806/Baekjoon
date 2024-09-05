import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		int sum = 0;
		String answer = "See you next month";
		while(n --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
			
			sum += x == 1 ? y : -y;
			
			if(sum < 0) {
				answer = "Adios";
				break;
			}
		}
		System.out.print(answer);
	}
}
