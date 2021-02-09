import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		int h = 0, m = 0, s = 0;
		int num = 0;
		
		int result = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			h = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			s = Integer.parseInt(st.nextToken());
			num = h * 3600 + m * 60 + s;
			
			h = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			s = Integer.parseInt(st.nextToken());
			result = h * 3600 + m * 60 + s - num;
			
			sb.append(result/3600).append(" ").append((result%3600)/60).append(" ").append(result%60).append("\n");
		}
		System.out.print(sb);
	}
}
