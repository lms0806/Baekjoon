import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			String s = br.readLine();
			
			sb.append(solve(s)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int solve(String s) {
		if(s.contains("lol")) {
			return 0;
		}
		else if(s.contains("lo") || s.contains("ol") || s.contains("ll")) {
			return 1;
		}
		else {
			for(int i = 0; i < s.length() - 2; i++) {
				if(s.charAt(i) == 'l' && s.charAt(i + 2) == 'l') {
					return 1;
				}
			}
			if(s.contains("l") || s.contains("o")) {
				return 2;
			}
		}
		return 3;
	}
}
