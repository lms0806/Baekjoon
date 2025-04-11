import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		long m = Long.parseLong(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		while(n --> 0 && m > 0) {			
			m -= Long.parseLong(st.nextToken()) - 1;
		}
		System.out.print(m <= 0 ? "DIMI" : "OUT");
	}
}
