import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		
		int answer = 0, count = 0;
		while(b --> 0) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			int n = Integer.parseInt(st.nextToken());
			
			if(s.equals("enter")) {
				if(count + n > a) {
					answer++;
				}
				else {
					count += n;
				}
			}
			else {
				count -= n;
			}
		}
		System.out.print(answer);
	}
}
