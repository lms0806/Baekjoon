import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= size; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			sb.append("Case ").append(i).append(": ");
			if(a / b != 0 && a % b != 0) {
				sb.append(a / b).append(" ").append(a % b).append("/").append(b);
			}
			else if(a / b != 0) {
				sb.append(a / b);
			}
			else if(a % b != 0) {
				sb.append(a % b).append("/").append(b);
			}
			else {
				sb.append(0);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
