import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		String s = br.readLine();
		
		String[] str = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII"};
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length; i++) {
			if(s.contains(str[i])) {
				sb.append(i + 1).append(" ");
			}
		}
		System.out.print(sb);
	}
}
