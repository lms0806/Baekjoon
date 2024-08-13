import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {			
			sb.append(Integer.parseInt(br.readLine()) <= 2 ? 1 : 3).append("\n");
		}
		System.out.print(sb);
	}
}
