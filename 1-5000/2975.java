import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int a, b;
		String str = "";
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			str = st.nextToken();
			b = Integer.parseInt(st.nextToken());
			
			if(a == 0 && b == 0) {
				break;
			}
			
			if(str.equals("W")) {
				if(a-b < -200) {
					sb.append("Not allowed").append("\n");
				}
				else {
					sb.append(a-b).append("\n");
				}
			}
			else {
				sb.append(a+b).append("\n");
			}
		}
		System.out.print(sb);
	}
}
