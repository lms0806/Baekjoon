import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		int plusX = 0, plusY = 0, plusAll = 0;
		for(char c : br.readLine().toCharArray()) {
			if(c == 'R') {
				plusX++;
			}
			else if(c == 'U') {
				plusY++;
			}
			else {
				plusAll++;
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		
		int answer = 0;
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()) - 1, y = Integer.parseInt(st.nextToken()) - 1;
			
			if(x > 0 && y > 0 && plusAll > 0) {
				int min = Math.min(x, Math.min(y, plusAll));
				x -= min;
				y -= min;
			}
			
			if(x > 0 && plusX > 0) {
				x -= Math.min(x, plusX);
			}
			
			if(y > 0 && plusY > 0) {
				y -= Math.min(y, plusY);
			}
			
			if(x == 0 && y == 0) {
				answer++;
			}
		}
		System.out.print(answer);
	}
}
