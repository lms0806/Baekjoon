import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] num = new int[8], answer = new int[5];

		for (int i = 0; i < 8; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}

		int count = 0, sum = 0;
		for (int i = 0; i < 7; i++) {
			int number = 0;
			for (int j = 0; j < 8; j++) {
				if (num[j] > number) {
					number = num[j];
					answer[count] = j;
				}
			}
			sum += number;
			num[answer[count]] = 0;
			count++;
			if (count >= 5) {
				break;
			}
		}

		StringBuilder sb = new StringBuilder();
		sb.append(sum).append("\n");

		Arrays.sort(answer);

		for (int n : answer) {
			sb.append(n + 1).append(" ");
		}
		System.out.print(sb);
	}
}
