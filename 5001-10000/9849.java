import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		
		int maxx = 0, minx = 10000, maxy = 0, miny = 10000;
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			maxx = max(maxx, Integer.parseInt(st.nextToken()));
			minx = Math.min(minx, Integer.parseInt(st.nextToken()));
			maxy = max(maxy, Integer.parseInt(st.nextToken()));
			miny = Math.min(miny, Integer.parseInt(st.nextToken()));
		}
		
		System.out.print(max(0, minx - maxx) * max(0, miny - maxy));
	}
	
	public static int max(int a, int b) {
		return a > b ? a : b;
	}
}
