import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		String answer = "", answer1 = "";
		int maxy = 0, maxm = 0, maxd = 0;
		int miny = 2011, minm = 13, mind = 32;
		while(size --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			int d = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
			
			if(y > maxy || (y == maxy && m > maxm) || (y == maxy && m == maxm && d > maxd)) {
				maxy = y;
				maxm = m;
				maxd = d;
				answer = s;
			}
			
			if(y < miny || (y == miny && m < minm) || (y == miny && m == minm && d < mind)) {
				miny = y;
				minm = m;
				mind = d;
				answer1 = s;
			}
		}
		System.out.println(answer);
		System.out.print(answer1);
	}
}
