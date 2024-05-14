import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String s = br.readLine();
		
		int n = Integer.parseInt(br.readLine());
		
		int answer = 0;
		while(n --> 0) {
			if(s.startsWith(br.readLine().substring(0, 5))) {
				answer++;
			}
		}
		System.out.print(answer);
	}
}
