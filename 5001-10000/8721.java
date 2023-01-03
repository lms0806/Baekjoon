import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int answer = 0, idx = 1;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			if(Integer.parseInt(st.nextToken()) == idx) {
				idx++;
			}
			else {
				answer++;
			}
		}
		System.out.print(answer);
	}
}
