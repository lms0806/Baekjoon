import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), w = Integer.parseInt(st.nextToken()), h = Integer.parseInt(st.nextToken());
		
		int size = w * w + h * h;
		
		StringBuilder sb = new StringBuilder();
		while(n --> 0) {
			int k = Integer.parseInt(br.readLine());
			sb.append(k * k <= size ? "YES" : "NO").append("\n");
		}
		System.out.print(sb);
	}
}
