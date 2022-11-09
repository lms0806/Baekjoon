import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int num = Integer.parseInt(st.nextToken()), max = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		while(n --> 0) {
			int now = Integer.parseInt(br.readLine());
			
			if(num > now) {
				sb.append("NTV: Dollar dropped by ").append(num - now).append(" Oshloobs").append("\n");
				num = now;
			}
			else if(num < now) {
				num = now;
				if(max < num) {
					sb.append("BBTV: Dollar reached ").append(num).append(" Oshloobs, A record!").append("\n");
					max = num;
				}
			}
		}
		System.out.print(sb);
	}
}	
