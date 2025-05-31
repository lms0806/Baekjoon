import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int s = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
		
		c += Integer.parseInt(st.nextToken()) << 1;
		s += Integer.parseInt(st.nextToken());
		
		System.out.print(Math.min(c / 6, s / 3));
	}
}
