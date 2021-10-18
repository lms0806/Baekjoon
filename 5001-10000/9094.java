import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			
			int answer = 0;
			for(int i = 1; i < n - 1; i++) {
				int a = i * i;
				for(int j = i + 1; j < n; j++) {
					if((a + j * j + m) % (i * j) == 0) {
						answer++;
					}
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
