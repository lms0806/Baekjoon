import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		int count = 1;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m ; j++) {
				sb.append(count);
				if(j != m-1) {
					sb.append(" ");
				}
				count++;
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
