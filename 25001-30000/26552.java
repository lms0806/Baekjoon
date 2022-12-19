import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine()) + 1;
			
			while(true) {
				if(!String.valueOf(n).contains("0")) {
					break;
				}
				n++;
			}
			
			sb.append(n).append("\n");
		}
		System.out.print(sb);
	}
}
