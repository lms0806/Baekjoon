import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		System.out.print(solve(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
	}
	
	public static String solve(int s, int v1, int v2) {
		int t = (s / v1) * v1;
		
		while(t >= 0 && (s - t) % v2 != 0) {
			t -= v1;
		}
		
		if(t >= 0) {
			return (t / v1) + " " + (s - t) / v2;
		}
		else if(s % v2 == 0) {
			return "0 " + s / v2;
		}
		return "Impossible";
	}
}
