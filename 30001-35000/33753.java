import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		System.out.print(solve(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(br.readLine())));
	}
	
	public static int solve(int a, int b, int c, int t) {
		if(t <= 30) {
			return a;
		}
		
		t -= 30;
		
		return a + t / b * c + (t % b != 0 ? c : 0);
	}
}
