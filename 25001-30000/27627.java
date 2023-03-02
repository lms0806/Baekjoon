import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		System.out.print(solve(br.readLine()));
	}
	
	public static String solve(String s) {
		for(int i = 1; i < s.length(); i++) {
			String s1 = s.substring(0, i), s2 = s.substring(i);
			
			if(check(s1) && check(s2)) {
				return s1 + " " + s2;
			}
		}
		return "NO";
	}
	
	public static boolean check(String s) {
		return s.equals(new StringBuilder(s).reverse().toString());
	}
}
