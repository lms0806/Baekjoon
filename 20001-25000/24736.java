import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 2; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			sb.append(Integer(st.nextToken()) * 6 + Integer(st.nextToken()) * 3 + Integer(st.nextToken()) * 2 + Integer(st.nextToken()) + Integer(st.nextToken()) * 2).append(" ");
		}
		System.out.print(sb);
	}
	
	public static int Integer(String s) {
		return Integer.parseInt(s);
	}
}
