import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] x = new int[n], l = new int[n];
		char[] c = new char[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			x[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			l[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			c[i] = st.nextToken().charAt(0);
		}
		
		System.out.print(solve(x, l, c));
	}
	
	public static String solve(int[] x, int[] l, char[] c) {
		for(int i = 0; i < x.length; i++) {
			for(int j = i + 1; j < x.length; j++) {
				if(Math.abs(x[i] - x[j]) <= l[i] + l[j] && c[i] != c[j]) {
					return "YES\n" + (i + 1) + " " + (j + 1);
				}
			}
		}
		return "NO";
	}
}
