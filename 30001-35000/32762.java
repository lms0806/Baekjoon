import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < n; i++) {
			br.readLine();
		}

		double sum = 0;
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			sum += Double.parseDouble(st.nextToken());
		}
		
		System.out.print(sum / n);
	}
}
