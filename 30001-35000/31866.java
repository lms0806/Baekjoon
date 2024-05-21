import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		
		System.out.print(win(a, b) ? ">" : win(b, a) ? "<" : "=");
	}
	
	public static boolean win(int a, int b) {
		if(b != 0 && b != 2 && b != 5) {
			b = -1;
		}
		if(a != 0 && a != 2 && a != 5) {
			a = -1;
		}
		
		if(a == -1 && b != -1) {
			return false;
		}
		
		if(b == -1 && a != -1) {
			return true;
		}
		return (a == 5 && b == 0) || (a == 2 && b == 5) || (a == 0 && b == 2);
	}
}
