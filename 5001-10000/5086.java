import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int a = 0, b = 0;
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			if(a == 0 && b == 0) {
				break;
			}
			
			if(a%b == 0 && a/b != 0) {
				sb.append("multiple");
			}
			else if(b%a == 0 && b/a != 0) {
				sb.append("factor");
			}
			else {
				sb.append("neither");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
