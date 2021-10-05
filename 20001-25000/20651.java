import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		int[] num = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		int answer = 0;
		for(double i = 1.0; i <= n; i++) {
			for(int j = 0; j <= n - i; j++) {
				double number = 0;
				for(int k = j; k < j + i; k++) {
					number += num[k];
				}
				number /= i;
				for(int k = j; k < j + i; k++) {
					if(number == num[k]) {
						answer++;
						break;
					}
				}
			}
		}
		System.out.print(answer);
	}
}
