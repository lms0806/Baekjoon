import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double h = Double.parseDouble(st.nextToken()), w = Double.parseDouble(st.nextToken());
		double n = Double.parseDouble(st.nextToken()), m = Double.parseDouble(st.nextToken());
		
		System.out.print((long)Math.ceil(h / (n + 1)) * (long)Math.ceil(w / (m + 1)));
	}
}
