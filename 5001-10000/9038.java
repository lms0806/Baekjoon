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
			
			int answer = 0, sum = 0;
			String[] s = br.readLine().split(" ");
			for(int i = 0; i < s.length; i++) {
				if(sum + s[i].length() > n) {
					sum = s[i].length();
					answer++;
				}
				else {
					sum += s[i].length();
				}
				
				if(i < s.length - 1) {
					if(sum < n) {
						sum++;
					}
				}
			}
			
			sb.append(answer + (sum != 0 ? 1 : 0)).append("\n");
		}
		System.out.print(sb);
	}
}
