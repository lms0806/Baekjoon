import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static int num[];
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		num = new int[m];
		
		solve(1, 0);
		
		System.out.print(sb);
	}
	
	public static void solve(int at, int k) {
		if(k == m) {
			for(int a : num) {
				sb.append(a).append(" ");
			}
			sb.append("\n");
			return;
		}
		else {
			for(int i = at; i <= n; i++) {
				num[k] = i;
				solve(i, k + 1);
			}
		}
	}
}
