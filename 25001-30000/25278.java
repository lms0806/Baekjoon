import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int w = 0, t = -30, o = 0;
		while(n --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			int m = Integer.parseInt(st.nextToken());
			
			if(s.equals("ocean")) {
				w += m;
			}
			else if(s.equals("oxygen")) {
				o += m;
			}
			else {
				t += m;
			}
		}
		
		System.out.print(w >= 9 && t >= 8 && o >= 14 ? "liveable" : "not liveable");
	}
}
