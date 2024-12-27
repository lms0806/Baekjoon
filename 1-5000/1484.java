import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());

		int s = 1, e = 1;
		StringBuilder sb = new StringBuilder();
		while(true) {
			if(e * e - s * s == n) {
				sb.append(e).append("\n");
			}
			
			if(e * e - s * s > n) {
				if(e - s == 1) {
					break;
				}
				s++;
			}
			else {
				e++;
			}
		}
		System.out.print(sb.length() == 0 ? -1 : sb);
	}
}
