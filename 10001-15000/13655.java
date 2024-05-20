import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s;
		StringBuilder sb = new StringBuilder();
		while((s = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(s);
			double d = Double.parseDouble(st.nextToken()), vf = Double.parseDouble(st.nextToken()), vg = Double.parseDouble(st.nextToken());
			
			double d1 = Math.sqrt(d * d + 144), d2 = 12;
			
			sb.append(d1 / vg <= d2 / vf ? "S" : "N").append("\n");
		}
		System.out.print(sb);
	}
}
