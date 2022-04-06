import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int b = Integer.parseInt(st.nextToken()), w = Integer.parseInt(st.nextToken());
		
		if(b < w) {
			w = b + 1;
		}
		else if(b > w) {
			b = w + 1;
		}
		
		System.out.print(b + w == 0 ? "Impossible" : (int)Math.sqrt(b + w));
	}
}
