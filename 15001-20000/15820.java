import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int s1 = Integer.parseInt(st.nextToken()), s2 = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		boolean b = true;
		while(s1 --> 0) {
			st = new StringTokenizer(br.readLine());
			if(b && !st.nextToken().equals(st.nextToken())) {
				b = false;
				sb.append("Wrong Answer");
			}
		}
		
		while(s2 --> 0) {
			st = new StringTokenizer(br.readLine());
			if(b && !st.nextToken().equals(st.nextToken())) {
				b = false;
				sb.append("Why Wrong!!!");
			}
		}
		
		if(b) {
			sb.append("Accepted");
		}
		
		System.out.print(sb);
	}
}
