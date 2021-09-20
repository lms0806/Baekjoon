import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			sb.append(Integer.parseInt(st.nextToken()) - 1).append("\n");
			
			int m = Integer.parseInt(st.nextToken());
			while(m --> 0) {
				br.readLine();
			}
		}
		System.out.print(sb);
	}
}
