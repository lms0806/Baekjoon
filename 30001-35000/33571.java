import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] lower = {1, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] upper = {1, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0};
		int answer = 0;
		for(char c : br.readLine().toCharArray()) {
			if(c == ' ') {
				continue;
			}
			
			if(c == '@') {
				answer++;
			}
			else if('a' <= c && c <= 'z') {
				answer += lower[c - 'a'];
			}
			else {
				answer += upper[c - 'A'];
			}
		}
		System.out.print(answer);
	}
}
