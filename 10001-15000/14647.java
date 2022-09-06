import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int max = 0, sum = 0;
		String[][] str = new String[n][m];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int count = 0;
			for(int j = 0; j < m; j++) {
				str[i][j] = st.nextToken();
				for(char c : str[i][j].toCharArray()) {
					if(c == '9') {
						count++;
					}
				}
			}
			sum += count;
			max = Math.max(max, count);
		}
		
		for(int i = 0; i < m; i++) {
			int count = 0;
			for(int j = 0; j < n; j++) {
				for(char c : str[j][i].toCharArray()) {
					if(c == '9') {
						count++;
					}
				}
			}
			max = Math.max(max, count);
		}
		
		System.out.print(sum - max);
	}
}
