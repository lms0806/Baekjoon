import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] strs = { "000000", "001111", "010011", "011100", "100110", "101001", "110101", "111010" };

		int size = Integer.parseInt(br.readLine());

		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size * 6; i += 6) {
			int[] num = new int[strs.length];
			
			String s = str.substring(i, i + 6);

			for (int j = 0; j < s.length(); j++) {
				for (int k = 0; k < strs.length; k++) {
					if (s.charAt(j) == strs[k].charAt(j)) {
						num[k]++;
					}
				}
			}

			boolean istrue = false;
			for (int j = 0; j < num.length; j++) {
				if (num[j] == 6 - 1 || num[j] == 6) {
					sb.append((char) (j + 65));
					istrue = true;
					break;
				}
			}

			if (!istrue) {
				sb.setLength(0);
				sb.append(i / 6 + 1);
				break;
			}
		}
		System.out.print(sb);
	}
}
