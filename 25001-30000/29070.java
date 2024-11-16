import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken()), w = Integer.parseInt(st.nextToken());
		
		System.out.print((int)(Math.ceil(1.0 * h / a) * Math.ceil(1.0 * w / b)));
	}
}
