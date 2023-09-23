import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), s = Integer.parseInt(st.nextToken());
		
		int answer = 0;
		while(n --> 0) {
			int num = Integer.parseInt(br.readLine());
			
			answer += num;
			
			if(n > 0 && answer > s) {
				answer--;
			}
		}
		System.out.print(answer);
	}
}
