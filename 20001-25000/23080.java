import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int k = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length(); i+=k) {
			sb.append(str.charAt(i));
		}
		System.out.print(sb);
	}
}
