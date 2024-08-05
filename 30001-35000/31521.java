import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] dice = new int[6];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			dice[Integer.parseInt(st.nextToken()) - 1]++;
		}
		
		System.out.print(solve(dice, n));
	}
	
	public static String solve(int[] dice, int n) {
		int count = 0;
		for(int d : dice) {
			if(d > 1) {
				return "0 " + (int)Math.pow(6, 4 - n);
			}
			
			if(d == 0) {
				count++;
			}
		}
		
		int a = 1;
		for(int i = 0; i < 4 - n; i++) {
			a *= count;
			count--;
		}
		
		return a + " " + (int)(Math.pow(6, 4 - n) - a);
	}
}
