import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			if(a == 0 && b == 0) {
				break;
			}
			int c = Integer.parseInt(st.nextToken());
            
			if(c - b == b - a) {
				sb.append("AP ").append(c + (b - a));
			}
			else {
				sb.append("GP ").append(c * (b / a));
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
