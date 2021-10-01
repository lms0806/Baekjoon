import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			
			int x = 0, y = 0;
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < m; i++) {
				x *= 10;
				x += Integer.parseInt(st.nextToken());
			}
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < m; i++) {
				y *= 10;
				y += Integer.parseInt(st.nextToken());
			}
			
			int[] num = new int[n + m];
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				num[i] = Integer.parseInt(st.nextToken());
			}
			for(int i = n; i < num.length; i++) {
				num[i] = num[i - n];
			}
			
			int answer = 0;
			for(int i = 0; i < num.length - m; i++) {
				int number = 0;
				for(int j = i; j < i + m; j++) {
					number *= 10;
					number += num[j];
				}
				if(x <= number && number <= y) {
					answer++;
				}
			}
			
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
