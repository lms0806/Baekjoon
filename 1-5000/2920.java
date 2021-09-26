import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] num = new int[8];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}

		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == i + 1) {
				count++;
			} 
			else {
				break;
			}
		}

		int count1 = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == num.length - i) {
				count1++;
			} 
			else {
				break;
			}
		}
		System.out.print(count == 8 ? "ascending" : count1 == 8 ? "descending" : "mixed");
	}
}
