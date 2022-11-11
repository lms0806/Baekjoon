import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = 1;
		
		String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine().trim());
			
			if(n == 0) {
				break;
			}
			
			int[] count = new int[12];
			
			while(n --> 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				st.nextToken();
				
				count[Integer.parseInt(st.nextToken()) - 1]++;
			}
			
			sb.append("Case #").append(t++).append(":\n");
			for(int i = 0; i < 12; i++) {
				sb.append(month[i]).append(":").append("*".repeat(count[i])).append("\n");
			}
		}
		System.out.print(sb);
	}
}
