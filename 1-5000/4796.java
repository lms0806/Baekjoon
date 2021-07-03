import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int i = 1;
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int l = Integer.parseInt(st.nextToken());
			
			if(l == 0) {
				break;
			}
			
			int p = Integer.parseInt(st.nextToken()), v = Integer.parseInt(st.nextToken());
			
			sb.append("Case ").append(i).append(": ").append(v / p * l + Math.min(l, v % p)).append("\n");
			i++;
		}
		System.out.print(sb);
	}
}
