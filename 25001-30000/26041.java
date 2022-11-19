import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] strs = br.readLine().split(" ");
		
		String s = br.readLine();
		
		int answer = 0;
		for(String str : strs) {
			if(!s.equals(str) && str.startsWith(s)) {
				answer++;
			}
		}
		System.out.print(answer);
	}
}
