import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 3; i++) {
			sb.append(solve(br.readLine()) ? 1 : 0).append("\n");
		}
		System.out.print(sb);
	}
	
	public static boolean solve(String s) {
		char seven = s.charAt(7);
		if(seven != '1' && seven != '6' && seven != '9') {
			return false;
		}
		
		int d = Integer.parseInt(s.substring(0, 2));
		int m = Integer.parseInt(s.substring(2, 4));
		int y = Integer.parseInt(s.substring(4, 7));
		
		if(d == 0 || m == 0 || m > 12) {
			return false;
		}
		
		y += y < 600 ? 2000 : 1000;
		
		if(m == 2) {
			if((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
				if(d > 29) {
					return false;
				}
			}
			else {
				if(d > 28) {
					return false;
				}
			}
		}
		else {
			if(day[m] < d) {
				return false;
			}
		}
		
		int sum = 0;
		for(int i = 0; i < s.length() - 1; i++) {
			sum += Math.pow(s.charAt(i) - '0', 2);
		}
		
		if(sum % 7 != (s.charAt(s.length() - 1) - '0')) {
			return false;
		}
		
		return true;
	}
}
