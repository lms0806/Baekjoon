import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		long maxn = 0, maxm = 0, num;
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			num = Long.parseLong(st.nextToken());
			if(num > maxn) {
				maxn = num;
			}
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			num = Long.parseLong(st.nextToken());
			if(num > maxm) {
				maxm = num;
			}
		}
		
		System.out.println(maxn + maxm);
	}
}
