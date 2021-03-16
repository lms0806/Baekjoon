import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int a, b, c;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			
			sb.append(a).append(" ").append(b).append(" ").append(c).append(" ");
			
			if(a+b+c == 180) {
				sb.append("Seems OK");
			}
			else {
				sb.append("Check");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
