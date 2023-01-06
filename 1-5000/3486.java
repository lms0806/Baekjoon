import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = change(st.nextToken()) + change(st.nextToken());
			
			sb.append(change(String.valueOf(a))).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int change(String s) {
		return Integer.parseInt(new StringBuilder(s).reverse().toString());
	}
}
