import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		char[] ch = br.readLine().toCharArray();
		
		int m = Integer.parseInt(br.readLine());
		char[] ch2 = br.readLine().toCharArray();
		
		int answer = 0, idx = 0;
		while(answer <= 10000 && idx < m) {
			if(ch2[idx] == ch[answer % n]) {
				idx++;
			}
			answer++;
		}
		
		if(answer > 10000) {
			answer = -1;
		}
		System.out.print(answer);
	}
}
