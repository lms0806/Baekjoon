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
			
			double num = Double.parseDouble(st.nextToken()) * Double.parseDouble(st.nextToken()) * Double.parseDouble(st.nextToken());
			
			sb.append("$").append(String.format("%.2f", num)).append("\n");
		}
		System.out.print(sb);
	}
}
