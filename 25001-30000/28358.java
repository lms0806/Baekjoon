import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int[] days = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			boolean[] check = new boolean[10];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < 10; i++) {
				check[i] = Integer.parseInt(st.nextToken()) == 0;
			}
			
			int answer = 0;
			for(int i = 1; i < 13; i++) {
				if(!check[i % 10] || (i > 9 && !check[i / 10])) {
					continue;
				}
				
				for(int j = 1; j <= days[i]; j++) {
					if(!check[j % 10] || (j > 9 && !check[j / 10])) {
						continue;
					}
					answer++;
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
