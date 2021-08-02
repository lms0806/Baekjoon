import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken().replace(".", "")), b = Integer.parseInt(st.nextToken().replace(".", "")), c = Integer.parseInt(st.nextToken().replace(".", ""));
		
		StringBuilder sb = new StringBuilder();
		int count = 0;
		while(count * b <= a) {
			int n = a - count * b;
			if(n % c == 0) {
				sb.append(count).append(" ").append((int)(n / c)).append("\n");
			}
			count++;
		}
		System.out.print(sb.length() == 0 ? "none" : sb);
	}
}
