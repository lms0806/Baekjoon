import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			sb.append(solve(br.readLine())).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int solve(String s) {
		if(s.length() < 3) {
			return -1;
		}
		
		if(s.contains("MOO")) {
			return s.length() - 3;
		}
		
		if(s.contains("MOM") || s.contains("OOO")) {
			return s.length() - 2;
		}
		
		if(s.contains("OOM")) {
			return s.length() - 1;
		}
		
		return -1;
	}
}
