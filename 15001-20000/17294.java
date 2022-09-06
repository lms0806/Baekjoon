import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(solve(br.readLine()));
	}
	
	public static String solve(String s) {
		if(s.length() == 1) {
			return "◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!";
		}
		int d = s.charAt(1) - s.charAt(0);
		for(int i = 2; i < s.length(); i++) {
			if(s.charAt(i) - s.charAt(i - 1) != d) {
				return "흥칫뿡!! <(￣ ﹌ ￣)>";
			}
		}
		return "◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!";
	}
}
