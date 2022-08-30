import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		boolean[][] visited = new boolean[101][101];
		int answer = 0;
		for(int i = 0; i < 4; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken()), y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken()), y2 = Integer.parseInt(st.nextToken());
			
			for(int j = x1; j < x2; j++) {
				for(int k = y1; k < y2; k++) {
					if(!visited[j][k]) {
						visited[j][k] = true;
						answer++;
					}
				}
			}
		}
		System.out.print(answer);
	}
}
