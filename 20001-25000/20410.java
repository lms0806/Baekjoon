import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		solve(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
	}
	
	public static void solve(int m, int seed, int x1, int x2) {
		for(int a = 1; a < m; a++) {
			for(int c = 1; c < m; c++) {
				if((a * seed + c) % m == x1 && (a * x1 + c) % m == x2) {
					System.out.print(a + " " + c);
					return;
				}
			}
		}
	}
}
