import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int g = Integer.parseInt(st.nextToken()), p = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());
		
		System.out.print(g * p < g + (t * p) ? 1 : g * p > g + (t * p) ? 2 : 0);
	}
}
