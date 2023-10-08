import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int idx = 0;
			int x = 0, y = 0;
			int maxx = 0, minx = 0;
			int maxy = 0, miny = 0;
			for(char c : br.readLine().toCharArray()) {
				if(c == 'L') {
					idx--;
					
					if(idx < 0) {
						idx += 4;
					}
				}
				else if(c == 'R') {
					idx++;
					
					if(idx == 4) {
						idx = 0;
					}
				}
				else {
					if(c == 'F') {
						x += dx[idx];
						y += dy[idx];
					}
					else {
						x -= dx[idx];
						y -= dy[idx];
					}
					
					maxx = Math.max(x, maxx);
					minx = Math.min(x, minx);
					maxy = Math.max(y, maxy);
					miny = Math.min(y, miny);
				}
			}
			
			sb.append((maxx - minx) * (maxy - miny)).append("\n");
		}
		System.out.print(sb);
	}
}
