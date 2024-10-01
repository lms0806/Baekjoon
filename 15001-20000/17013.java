import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean h = false, v = false;
		
		for(char c : br.readLine().toCharArray()) {
			if(c == 'H') {
				h = !h;
			}
			else {
				v = !v;
			}
		}
		
		System.out.print(solve(h, v));
	}
	
	public static String solve(boolean h, boolean v) {
		if(!h) {
			return !v ? "1 2\n3 4" : "2 1\n4 3";
		}
		return !v ? "3 4\n1 2" : "4 3\n2 1";
	}
}
