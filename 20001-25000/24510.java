import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int answer = 0;
		while(t --> 0) {
			int num = 0;
			String s = br.readLine().replaceAll("for", " ").replaceAll("while", " ");
			
			for(char c : s.toCharArray()) {
				if(c == ' ') {
					num++;
				}
			}
			answer = Math.max(answer, num);
		}
		System.out.print(answer);
	}
}
