import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double h = Double.parseDouble(st.nextToken()), w = Double.parseDouble(st.nextToken());
		
		if(w > h) {
			double temp = w;
			w = h;
			h = temp;
		}
		
		System.out.print(String.format("%.4f", h >= 3 * w ? w : 10 * h >= 15 * w ? h / 3 : w / 2));
	}
}
