import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		
		int answer = Integer.MAX_VALUE;
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int cost = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
			
			boolean flag = false;
			st = new StringTokenizer(br.readLine());
			while(n --> 0) {
				int num = Integer.parseInt(st.nextToken());
				
				if(num == a) {
					flag = true;
				}
				else if(num == b && flag) {
					answer = Math.min(answer, cost);
					break;
				}
			}
		}
		System.out.print(answer == Integer.MAX_VALUE ? -1 : answer);
	}
}
