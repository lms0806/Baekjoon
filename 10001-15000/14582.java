import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] a = new int[9], b = new int[9];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 9; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 9; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.print(solve(a, b));
	}
	
	public static String solve(int[] a, int[] b) {
		int suma = 0, sumb = 0;
		for(int i = 0; i < 9; i++) {
			suma += a[i];
			
			if(suma > sumb) {
				return "Yes";
			}
			
			sumb += b[i];
		}
		return "No";
	}
}
