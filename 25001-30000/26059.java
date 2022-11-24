import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
			
		int t = Integer.parseInt(st.nextToken());
		
		String[] s = st.nextToken().split("\\,");
		
		int a = Integer.parseInt(s[0]), b = Integer.parseInt(s[1]);
		
		int maxnum = -1;
		String answer = "-1";
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String[] str = st.nextToken().split("\\,");
			
			int aa = Integer.parseInt(str[0]), bb = Integer.parseInt(str[1]);
			if(a >= aa && b >= bb && maxnum < aa * 100 + bb) {
				answer = name;
				maxnum = aa * 100 + bb;
			}
		}
		System.out.print(answer);
	}
}
