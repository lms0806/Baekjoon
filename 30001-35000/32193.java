import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int temp = 0;
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			temp = Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken()) + temp;
			
			sb.append(temp).append("\n");
		}
		System.out.print(sb);
	}
}
