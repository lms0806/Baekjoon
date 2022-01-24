import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
		
		int answer = min(abs(a + c - b - d), abs(a + c + d - b));
		answer = min(answer, min(abs(a + b - c - d), min(abs(a + b + c - d), abs(a + b + d - c))));
		answer = min(answer, min(abs(a + d - b - c), abs(b + c + d - a)));
		
		System.out.print(answer);
	}
	
	public static int min(int a, int b) {
		return a > b ? b : a;
	}
	
	public static int abs(int a) {
		return Math.abs(a);
	}
}
