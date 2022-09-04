import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		boolean[] alpha = new boolean[26];
		while(n --> 0) {
			alpha[br.readLine().charAt(0) - 'A'] = true;
		}
		
		int answer = 0;
		for(boolean b : alpha) {
			if(b) {
				answer++;
			}
			else {
				break;
			}
		}
		System.out.print(answer);
	}
}
