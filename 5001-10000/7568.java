import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		int[][] num = new int[size][2];
		
		for(int i = 0; i < size; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			num[i][0] = Integer.parseInt(st.nextToken());
			num[i][1] = Integer.parseInt(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++) {
			int answer = 1;
			for(int j = 0; j < size; j++) {
				if(i != j && num[i][0] < num[j][0] && num[i][1] < num[j][1]) {
					answer++;
				}
			}
			sb.append(answer).append(" ");
		}
		System.out.print(sb);
	}
}
