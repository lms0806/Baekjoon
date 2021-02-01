import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[][] num = new int[n][m];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				num[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		int[][] num1 = new int[n][m];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				num1[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[][] answer = new int[num.length][num1[0].length];
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num1[0].length; j++){
                for(int k = 0; k < num[0].length; k++){
                    answer[i][j] += num[i][k] * num1[k][j];
                }
                sb.append(answer[i][j]).append(" ");
            }
            sb.append("\n");
        }
		System.out.println(sb);
	}
}
