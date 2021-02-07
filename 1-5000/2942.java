import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int r = Integer.parseInt(st.nextToken());
		int g = Integer.parseInt(st.nextToken());
		
		int i = 1;
		int rn,gn;
		StringBuilder sb = new StringBuilder();
		while(i <= r || i <= g) {
			rn = r / i;
			gn = g / i;
			if(r%i == 0 && g%i == 0) {
				sb.append(i).append(" ").append(rn).append(" ").append(gn).append("\n");
			}
			i++;
		}
		System.out.print(sb);
	}
}
