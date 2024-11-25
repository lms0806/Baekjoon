import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				break;
			}
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
			
			if(b - a == c - b) {
				sb.append((n * (2 * a + (n - 1) * (b - a))) / 2);
			}
			else if(b / a == c / b){
				sb.append((int)(a * (Math.pow(b / a, n) - 1) / (b / a - 1)));
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
