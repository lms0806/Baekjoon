import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		
		int c = Integer.parseInt(br.readLine());
		
		int n = Integer.parseInt(br.readLine());
		if (a==c && b<0) {
			System.out.print(1);
		}
		else {
			System.out.print(a >= c ? 0 : a * n + b <= c * n ? 1 : 0);
		}
	}
}
