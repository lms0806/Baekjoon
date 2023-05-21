import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = 0;
		while(t --> 0) {
			n += 8 + Integer.parseInt(st.nextToken());
		}

        n -= 8;		

		System.out.print(n / 24 + " " + n % 24);
	}
}
