import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int answer = 1;
		for(char c : br.readLine().toCharArray()) {
			if(c == 'T' || c == 'D' || c == 'L' || c == 'F') {
				answer *= 2;
			}
		}
		System.out.print(answer);
	}
}
