import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] arr = new int[501][501];
		
		int t = Integer.parseInt(br.readLine());
		
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken()), y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken()), y2 = Integer.parseInt(st.nextToken());
			
			for(int i = x1; i < x2; i++) {
				for(int j = y1; j < y2; j++) {
					arr[i][j] = 1;
				}
			}
		}
		
		int answer = 0;
		for(int i = 0; i < 501; i++) {
			for(int j = 0; j < 501; j++) {
				if(arr[i][j] == 1) {
					answer++;
				}
			}
		}
		System.out.print(answer);
	}
}
