import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		String[] a = new String[n], b = new String[m];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			a[i] = st.nextToken();
		}
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			b[i] = st.nextToken();
		}
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int num = Integer.parseInt(br.readLine()) - 1;
			
			sb.append(a[num % a.length]).append(b[num % b.length]).append("\n");
		}
		System.out.print(sb);
	}
}
