import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		char[][] ch = {{'*', 'x', '*'}, {' ', 'x', 'x'}, {'*', ' ', '*'}};
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < n; j++) {
				for(int k = 0; k < 3; k++) {
					sb.append((ch[i][k] + "").repeat(n));
				}
				sb.append("\n");
			}
		}
		System.out.print(sb);
	}
}
