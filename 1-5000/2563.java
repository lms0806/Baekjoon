import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] num = new int[100][100];
		
		int size = Integer.parseInt(br.readLine());
		while(size --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()) - 1, b = Integer.parseInt(st.nextToken()) - 1;
			
			for(int i = a; i < a + 10; i++) {
				for(int j = b; j < b + 10; j++) {
					num[i][j]++;
				}
			}
		}
		
		int answer = 0;
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; j++) {
				if(num[i][j] != 0) {
					answer++;
				}
			}
		}
		System.out.print(answer);
		
	}
}
