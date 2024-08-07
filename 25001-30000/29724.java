import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int count = 0, box = 0;
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			char c  = st.nextToken().charAt(0);
			int w = Integer.parseInt(st.nextToken()), h = Integer.parseInt(st.nextToken()), l = Integer.parseInt(st.nextToken());
			
			if(c == 'A') {
				count += (w / 12) * (h / 12) * (l / 12);
			}
			box += c == 'A' ? 1000 : 6000;
		}
		System.out.print((box + (count * 500)) + "\n" + count * 4000);
	}
}
