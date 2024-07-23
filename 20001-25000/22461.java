import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			int answer = 0;
			while(n > 9) {
				int max = 0;
				int size = String.valueOf(n).length();
				for(int i = 0; i < size; i++) {
					int num = (int)Math.pow(10, i);
					
					int div = n / num, mod = n % num;
					
					max = Math.max(max, div * mod);
				}
				n = max;
				answer++;
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
