import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[][] num = new boolean[101][101];
		
		int size = Integer.parseInt(br.readLine());
		
		int answer = 0;
		while(size --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			for(int i = a; i < a + 10; i++) {
				for(int j = b; j < b + 10; j++) {
					if(!num[i][j]) {
						answer++;
						num[i][j] = true;
					}
				}
			}
		}
		System.out.print(answer);
	}
}
