import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int s = Integer.parseInt(st.nextToken()) * 30, v = Integer.parseInt(st.nextToken()) * 30;
		
		int l = Integer.parseInt(br.readLine()) * 100;
		
		int answer = 0;
		while(true) {
			if(l >= 25000) {
				break;
			}
			
			if(v > 0) {
				v--;
				l += c;
			}
			else if(s > 0) {
				s--;
				l += b;
			}
			else {
				l += a;
			}
			
			answer++;
		}
		System.out.print(answer);
	}
}
