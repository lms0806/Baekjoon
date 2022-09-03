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
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			
			int onecount = 0, num = n;
			while(num != 0) {
				if(num % 2 == 1) {
					onecount++;
				}
				num /= 2;
			}
			
			sb.append(onecount % 2 == m ? "Valid" : "Corrupt").append("\n");
		}
		System.out.print(sb);
	}
}
