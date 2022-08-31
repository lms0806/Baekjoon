import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			char choice = st.nextToken().charAt(0);
			
			if(choice == 'C') {
				st = new StringTokenizer(br.readLine());
				while(n --> 0) {
					sb.append(st.nextToken().charAt(0) - 'A' + 1).append(" ");
				}
			}
			else {
				st = new StringTokenizer(br.readLine());
				while(n --> 0) {
					sb.append((char)(Integer.parseInt(st.nextToken()) + 'A' - 1)).append(" ");
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}