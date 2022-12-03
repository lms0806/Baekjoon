import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		String[] s = br.readLine().replaceAll("b", " ").split(" ");
		
		int answer = 0;
		for(int i = 0; i < s.length; i++) {
			if(s[i].length() > 1) {
				answer += s[i].length();
			}
		}
		System.out.print(answer);
	}
}
