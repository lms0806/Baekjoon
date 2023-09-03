import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		double d = Double.parseDouble(st.nextToken()), s = Double.parseDouble(st.nextToken());
		
		double answer = (d * n - (s * k)) / (n - k);
		
		System.out.print(answer > 100 || answer < 0 ? "impossible" : answer);
	}
}
