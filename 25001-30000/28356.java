import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		System.out.print(solve(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
	}
	
	public static String solve(int n, int m) {
		if(n == 1 && m == 1) {
			return "1\n1";
		}
		
		StringBuilder sb = new StringBuilder();
		if(n == 1 || m == 1) {
			sb.append(2).append("\n");
			for(int i = 0; i < n * m; i++) {
				if(i % 2 == 0) {
					sb.append(1);
				}
				else {
					sb.append(2);
				}
				
				if(n == 1) {
					sb.append(" ");
				}
				else {
					sb.append("\n");
				}
			}
			return sb.toString();
		}
		
		int[][] arr = {{1, 2, 1, 2}, {3, 4, 3, 4}};
		sb.append(4).append("\n");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				sb.append(arr[i % 2][j % 4]);
				
				if(j + 1 == m) {
					sb.append("\n");
				}
				else {
					sb.append(" ");
				}
			}
		}
		return sb.toString();
	}
}
