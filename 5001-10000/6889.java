import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()), m = Integer.parseInt(br.readLine());
		
		String[] a = new String[n], b = new String[m];
		
		for(int i = 0; i < n; i++) {
			a[i] = br.readLine();
		}
		for(int i = 0; i < m; i++) {
			b[i] = br.readLine();
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				sb.append(a[i]).append(" as ").append(b[j]).append("\n");
			}
		}
		System.out.print(sb);
	}
}
