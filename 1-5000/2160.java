import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());
		String[] str = new String[size];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < 5; j++) {
				String s = br.readLine();
				str[i] = str[i] == null ? s : str[i] + s;
			}
		}

		int answer = size * 5;
		int a = 1, b = 2;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				int num = 0;
				for (int k = 0; k < str[j].length(); k++) {
					if (str[i].charAt(k) != str[j].charAt(k)) {
						num++;
					}
				}
				if (num < answer) {
					answer = num;
					a = i + 1;
					b = j + 1;
				}
			}
		}
		System.out.print(a + " " + b);
	}
}
