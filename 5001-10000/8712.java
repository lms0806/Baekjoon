import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int num = 1;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			if(i % 2 == 0) {
				for(int j = 0; j < n; j++) {
					sb.append(num++).append(" ");
				}
			}
			else {
				for(int j = n - 1; j >= 0; j--) {
					sb.append(num + j).append(" ");
				}
				num += n;
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
