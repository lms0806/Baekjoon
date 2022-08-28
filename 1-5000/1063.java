import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String s = st.nextToken();
		int kingx = s.charAt(1) - '1', kingy = s.charAt(0) - 'A';
		s = st.nextToken();
		int stonex = s.charAt(1) - '1', stoney = s.charAt(0) - 'A';
		
		int t = Integer.parseInt(st.nextToken());
		
		String[] road = {"R","L","B","T","RT","LT","RB","LB"};
		int[] dx = {0, 0, -1, 1, 1, 1, -1, -1};
		int[] dy = {1, -1, 0, 0, 1, -1, 1, -1};
		
		while(t --> 0) {
			String str = br.readLine();
			
			int idx = 0;
			for(int i = 0; i < road.length; i++) {
				if(str.equals(road[i])) {
					idx = i;
					break;
				}
			}
			kingx += dx[idx];
			kingy += dy[idx];
			
			if(kingx < 0 || kingx > 7 || kingy < 0 || kingy > 7) {
				kingx -= dx[idx];
				kingy -= dy[idx];
			}
			else if(kingx == stonex && kingy == stoney){
				stonex += dx[idx];
				stoney += dy[idx];
				if(stonex < 0 || stonex > 7 || stoney < 0 || stoney > 7) {
					kingx -= dx[idx];
					kingy -= dy[idx];
					stonex -= dx[idx];
					stoney -= dy[idx];
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append((char)(kingy + 'A')).append(kingx + 1).append("\n");
		sb.append((char)(stoney + 'A')).append(stonex + 1);
		System.out.print(sb);
	}
}
