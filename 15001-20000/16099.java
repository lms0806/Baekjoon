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
			
			long a = Long.parseLong(st.nextToken()) * Long.parseLong(st.nextToken());
			long b = Long.parseLong(st.nextToken()) * Long.parseLong(st.nextToken());
			
			sb.append(a > b ? "TelecomParisTech" : a == b ? "Tie" : "Eurecom").append("\n");
		}
		System.out.print(sb);
	}
}
