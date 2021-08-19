import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()), m = Integer.parseInt(br.readLine());
		
		int[] num = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(num);
		
		int start = 0, end = num.length - 1, answer = 0;
		while(start < end) {
			if(num[start] + num[end] == m) {
				start++;
				end--;
				answer++;
			}
			else {
				if(num[start] + num[end] > m) {
					end--;
				}
				else {
					start++;
				}
			}
		}
		System.out.print(answer);
	}
}
