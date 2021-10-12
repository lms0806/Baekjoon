import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
		
		System.out.print(solve(Math.abs(a), Math.abs(b), c));
	}
	
	public static String solve(int a, int b, int c) {
		if(a + b <= c) {
			if(((a + b) % 2 == 0 && c % 2 == 0) || ((a + b) % 2 != 0 && c % 2 != 0)) {
				return "YES";
			}
		}
		return "NO";
	}
}
