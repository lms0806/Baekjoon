import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] num = new int[5];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		boolean check = true;
		StringBuilder sb = new StringBuilder();
		while(check) {
			check = false;
			for(int i = 0; i < num.length - 1; i++) {
				if(num[i] > num[i + 1]) {
					int temp = num[i];
					num[i] = num[i + 1];
					num[i + 1] = temp;
					check = true;
					for(int n : num) {
						sb.append(n).append(" ");
					}
					sb.append("\n");
				}
			}
		}
		System.out.print(sb);
	}
}
