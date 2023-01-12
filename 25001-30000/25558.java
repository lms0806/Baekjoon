import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long startx = Long.parseLong(st.nextToken()), starty = Long.parseLong(st.nextToken());
		long endx = Long.parseLong(st.nextToken()), endy = Long.parseLong(st.nextToken());
		
		int answer = 0;
		long min = Long.MAX_VALUE;
		for(int i = 1; i <= t; i++) {
			int n = Integer.parseInt(br.readLine());
			
			long sum = 0;
			long beforex = startx, beforey = starty;
			while(n --> 0) {
				st = new StringTokenizer(br.readLine());
				long x = Long.parseLong(st.nextToken()), y = Long.parseLong(st.nextToken());
				
				sum += Math.abs(beforex - x) + Math.abs(beforey - y);
				
				beforex = x;
				beforey = y;
			}
			
			sum += Math.abs(beforex - endx) + Math.abs(beforey - endy);
			
			if(min > sum) {
				min = sum;
				answer = i;
			}
		}
		System.out.print(answer);
	}
}
