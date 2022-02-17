import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] mo = {"A","I","Y","E","O","U"};
		String[] mo2 = {"a","i","y","e","o","u"};
		String[] ja = {"B","K","X","Z","N","H","D","C","W","G","P","V","J","Q","T","S","R","L","M","F"};
		String[] ja2 = {"b","k","x","z","n","h","d","c","w","g","p","v","j","q","t","s","r","l","m","f"};
		
		String s = "";
		
		StringBuilder sb = new StringBuilder();
		while((s = br.readLine()) != null) {
			String[] str = s.split("");
			
			for(int i = 0; i < str.length; i++) {
				if(check(str[i], mo)) {
					sb.append(solve(str[i], mo, true));
				}
				else if(check(str[i], mo2)) {
					sb.append(solve(str[i], mo2, true));
				}
				else if(check(str[i], ja)) {
					sb.append(solve(str[i], ja, false));
				}
				else if(check(str[i], ja2)) {
					sb.append(solve(str[i], ja2, false));
				}
				else {
					sb.append(str[i]);
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
	
	public static boolean check(String s, String[] str) {
		return Arrays.asList(str).contains(s) ? true : false;
	}
	
	public static String solve(String s, String[] str, boolean flag) {
		return str[(Arrays.asList(str).indexOf(s) + (flag ? 3 : 10)) % str.length];
	}
}
