import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] num = new int[1001][1001];
		
		int size = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= size; t++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken()), h = Integer.parseInt(st.nextToken());
			
			for(int i = x; i < x + w; i++) {
				for(int j = y; j < y + h; j++) {
					num[i][j] = t;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= size; t++) {
			int answer = 0;
			for(int i = 0; i < 1001; i++) {
				for(int j = 0; j < 1001; j++) {
					if(num[i][j] == t) {
						answer++;
					}
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
