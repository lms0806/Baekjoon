import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		int min = Integer.MAX_VALUE;
		while(n --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			min = Math.min(num + (a * b / gcd(a, b)), min);
		}
		System.out.print(min);
	}
	
	public static int gcd(int a, int b){
		if (a % b == 0) {
			return b;
		}
		return gcd(b, a % b);
	}
}
