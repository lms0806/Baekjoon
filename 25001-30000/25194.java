import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 5); 
		
		int n = Integer.parseInt(br.readLine());
		
		int[] d = new int[7001];
		d[0] = 1;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			int x = Integer.parseInt(st.nextToken()) % 7;
			
			for(int j = 7000; j >= x; j--) {
				d[j] |= d[j - x];
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 4; i <= 7000; i+=7) {
			if(d[i] == 1) {
				sb.append("YES");
				break;
			}
		}
		System.out.print(sb.toString().equals("") ? "NO" : sb);
	}
}
