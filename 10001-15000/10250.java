import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int h = Integer.parseInt(st.nextToken()), w = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());

			sb.append(n % h == 0 ? (h * 100) + (n / h) : (n % h) * 100 + (n / h + 1)).append("\n");
		}
		System.out.print(sb);
	}
}
