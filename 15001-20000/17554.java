import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		boolean[] flag = new boolean[n + 1];
		
		int t = Integer.parseInt(br.readLine());
		
		int answer = 0, count = 0;
		while(t --> 0) {
			int num = Integer.parseInt(br.readLine());
			
			for(int i = num; i <= n; i+= num) {
				if(!flag[i]) {
					count++;
					flag[i] = true;
				}
				else {
					count--;
					flag[i] = false;
				}
			}

			answer = Math.max(answer, count);
		}
		System.out.print(answer);
	}
}
