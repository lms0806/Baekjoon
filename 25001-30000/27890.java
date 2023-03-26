import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());
		
		while(t --> 0) {
			x = x % 2 == 0 ? (x / 2) ^ 6 : (x * 2) ^ 6;
		}
		
		System.out.print(x);
	}
}
