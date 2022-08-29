import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int which = m;
		
		int t = Integer.parseInt(br.readLine());
		
		int answer = 0;
		while(t --> 0) {
			int num = Integer.parseInt(br.readLine());
			
			while(true) {
				if(which - m + 1 > num) {
					which--;
				}
				else if(num > which) {
					which++;
				}
				else {
					break;
				}
				answer++;
			}
		}
		System.out.print(answer);
	}
}
