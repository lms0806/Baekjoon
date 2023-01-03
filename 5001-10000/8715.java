import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		boolean[] check = new boolean[n + 1];
		
		String answer = "TAK";
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			int a = Integer.parseInt(st.nextToken());
			
			if(a > n || check[a] || a == 0) {
				answer = "NIE";
				break;
			}
			
			check[a] = true;
		}
		
		System.out.print(answer);
	}
}
