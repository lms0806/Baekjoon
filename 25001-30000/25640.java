import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		int answer = 0;
		int t = Integer.parseInt(br.readLine());
		
		while(t --> 0) {
			if(s.equals(br.readLine())) {
				answer++;
			}
		}
		
		System.out.print(answer);
	}
}
