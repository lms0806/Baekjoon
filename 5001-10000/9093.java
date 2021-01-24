import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		int size = Integer.parseInt(br.readLine());
	
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				StringBuilder answer = new StringBuilder(st.nextToken());
				sb.append(answer.reverse()).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
