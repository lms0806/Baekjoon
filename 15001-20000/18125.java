import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[][] a = new int[m][n];
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				a[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		boolean flag = true;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = m - 1; j >= 0; j--) {
				if(Integer.parseInt(st.nextToken()) != a[j][i]) {
					flag = false;
					break;
				}
			}
			
			if(!flag) {
				break;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(flag ? "|>___/|        /}\n| O < |       / }\n(==0==)------/ }\n| ^  _____    |\n|_|_/     ||__|" : "|>___/|     /}\n| O O |    / }\n( =0= )\"\"\"\"  \\\n| ^  ____    |\n|_|_/    ||__|\n");
		System.out.print(sb);
	}
}
