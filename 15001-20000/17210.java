import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		
		int num = Integer.parseInt(br.readLine());
		
		if(n > 5) {
			System.out.print("Love is open door");
		}
		else {
			StringBuilder sb = new StringBuilder();
			for(int i = 1; i < n; i++) {
				sb.append(num == 1 ? 0 : 1).append("\n");
				num = num == 1 ? 0 : 1;
			}
			System.out.print(sb);
		}
	}
}
