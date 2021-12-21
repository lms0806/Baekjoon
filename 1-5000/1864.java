import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] check = {'-', '\\', '(', '@', '?', '>', '&', '%', '/'};

		StringBuilder sb = new StringBuilder();
		while (true) {
			String str = br.readLine();
			
			if (str.equals("#")) {
				break;
			}
			
			int pow = 0, num = 0, sum = 0;
			for (int i = 0; i < str.length(); i++) {
				pow = (int) Math.pow(8, str.length() - i - 1);
				for (int j = 0; j < check.length; j++) {
					if(str.charAt(i) == check[j]) {
						num = j == check.length - 1 ? -1 : j;
						break;
					}
				}
				sum += pow * num;
			}
			sb.append(sum).append("\n");
		}
		System.out.print(sb);
	}
}
