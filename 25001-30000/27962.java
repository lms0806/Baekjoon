import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		char[] c = br.readLine().toCharArray();
		
		String answer = "NO";
		for(int i = 1; i < c.length; i++) {
			int idx = c.length - i, count = 0;
			
			for(int j = 0; j < i; j++) {
				if(c[j] == c[idx + j]) {
					count++;
				}
			}
			
			if(count == i - 1) {
				answer = "YES";
				break;
			}
		}
		System.out.print(answer);
	}
}
