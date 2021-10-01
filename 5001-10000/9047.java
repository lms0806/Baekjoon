import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			int answer = 0;
			while(n != 6174) {
				int[] num = new int[4];
				
				for(int i = 0; i < 4; i++) {
					num[i] = n % 10;
					n /= 10;
				}
				
				Arrays.sort(num);
				
				n = 0;
				for(int i = 0; i < 4; i++) {
					n *= 10;
					n += num[3 - i] - num[i];
				}
				
				answer++;
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
