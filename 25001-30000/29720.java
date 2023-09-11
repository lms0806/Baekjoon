import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		int min = Math.max(0, n - m * k);
		int max = Math.max(0, n - m * k + m - 1);
		
		System.out.print(min + " " + max);
	}
}
