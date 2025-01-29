import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double r = Double.parseDouble(st.nextToken()) / 2.0 + 5.0, h = Double.parseDouble(st.nextToken());
		
		System.out.print(Math.PI * 2 * r * h + Math.PI * r * r);
	}
}
