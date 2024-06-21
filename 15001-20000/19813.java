import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		while (t-- > 0) {
			String str = br.readLine();
			boolean isDot = str.contains(".");
			String[] s = str.contains(".") ? str.split("\\.") : str.split("/");
			
			int a = Integer.parseInt(s[0]), b = Integer.parseInt(s[1]), c = Integer.parseInt(s[2]);

			sb.append(String.format("%02d.%02d.%04d", isDot ? a : b, isDot ? b : a, c)).append(" ");
			sb.append(String.format("%02d/%02d/%04d", isDot ? b : a, isDot ? a : b, c)).append("\n");
		}
		System.out.print(sb);
	}
}
