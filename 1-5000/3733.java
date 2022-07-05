import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String s;
		StringBuilder sb = new StringBuilder();
		while((s = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(s);
			int n = Integer.parseInt(st.nextToken());
			sb.append(Integer.parseInt(st.nextToken()) / (n + 1)).append("\n");
		}
		System.out.print(sb);
	}
}
