import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		String[] s = br.readLine().split(" ");
		
		int n = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length; i++) {
			sb.append(s[i].length() > n ? s[i].charAt(n) : " ");
			n = s[i].length() - 1;
		}
		System.out.print(sb);
	}
}
