import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x1 = Integer.parseInt(st.nextToken()), x2 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken()), e = Integer.parseInt(st.nextToken());
		
		System.out.print(solve(a, b, c, d, e, x2) - solve(a, b, c, d, e, x1));
	}
	
	public static int solve(int a, int b, int c, int d, int e, int x) {
		return a * x * x * x / 3 + (b - d) * x * x / 2 + (c - e) * x;
	}
}
