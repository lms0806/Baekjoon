import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int answer = 0, bA = 0, bB = 0;
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			if(a != 0 && bA == a) {
				answer++;
			}
			if(b != 0 && bB == b) {
				answer++;
			}
			
			if(a != 0 && a == b) {
				answer++;
			}
			
			bA = a;
			bB = b;
		}
		System.out.print(answer);
	}
}
