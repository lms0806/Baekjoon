import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		String s = br.readLine();
		
		int num = 0, count = 0;
		for(int i = 0; i < k; i++) {
			if(s.charAt(i) == 'L') {
				num++;
				count++;
			}
		}
		
		int answer = 0;
		for(int i = k; i < s.length(); i++) {
			if(s.charAt(i - k) == 'L') {
				count--;
			}
			if(s.charAt(i) == 'L') {
				count++;
			}
			
			if(num < count) {
				answer = i - k + 1;
				num = count;
			}
		}
		System.out.print(answer + 1);
	}
}
