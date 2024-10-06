import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String[] bit = new String[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			bit[i] = Long.toBinaryString(Long.parseLong(st.nextToken()));
		}
		
		int[] count = new int[32];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < bit[i].length(); j++) {
				count[count.length - 1 - j] += bit[i].charAt(bit[i].length() - 1 - j) - '0';
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			long answer = 0;
			for(int j = 0; j < count.length; j++) {
				if(count[j] > 0) {
					answer += Math.pow(2, count.length - j - 1);
					count[j]--;
				}
			}
			sb.append(answer).append(" ");
		}
		System.out.print(sb);		
	}
}
