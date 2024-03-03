import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		String s = st.nextToken();
		
		int answer = 0;
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			int count = Integer.parseInt(st.nextToken());
			
			StringTokenizer sts = new StringTokenizer(str, "_");
			while(sts.hasMoreTokens()) {
				if(sts.nextToken().equals(s)) {
					answer += count;
					break;
				}
			}
		}
		System.out.print(answer);
	}
}
