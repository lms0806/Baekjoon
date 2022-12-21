import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double a = Double.parseDouble(st.nextToken()), b = Double.parseDouble(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			double c = Double.parseDouble(st.nextToken()), d = Double.parseDouble(st.nextToken());
			
			sb.append(a / b < Math.acos(-1) * c * c / d ? "Whole" : "Slice of").append(" pizza").append("\n");
		}
		System.out.print(sb);
	}
}
