import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken() + " "+ st.nextToken();
			while(st.hasMoreTokens()) {
				sb.append(st.nextToken()).append(" ");
			}
			sb.append(s).append("\n");
		}
		System.out.print(sb);
	}
}
