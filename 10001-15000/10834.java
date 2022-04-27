import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int rnum = 1;
		
		boolean r = true;
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			rnum = (rnum / Integer.parseInt(st.nextToken())) * Integer.parseInt(st.nextToken());
			r = Integer.parseInt(st.nextToken()) == 1 ? !r : r;
		}
		
		System.out.print((r ? "0 " : "1 ") + rnum);
	}
}
