import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			String[] s = new String[n];
			for(int i = 0; i < n; i++) {
				s[i] = br.readLine();
			}
			
			sb.append(solve(s)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int solve(String[] s) {
		int liveCount = s.length;
		boolean[] die = new boolean[s.length];
		for(int i = 0; i < s[0].length(); i++) {
			boolean[] flag = new boolean[3]; // R S P
			for(int j = 0; j < s.length; j++) {
				if(die[j]) {
					continue;
				}
				
				flag[s[j].charAt(i) == 'R' ? 0 : s[j].charAt(i) == 'S' ? 1 : 2] = true;
			}
			
			int count = 0;
			for(int j = 0; j < 3; j++) {
				if(flag[j]) {
					count++;
				}
			}
			
			if(count == 1 || count == 3) {
				continue;
			}
			
			char lose = 'R';
			if(flag[0] && flag[1]) {
				lose = 'S';
			}
			if(flag[1] && flag[2]) {
				lose = 'P';
			}
			
			for(int j = 0; j < s.length; j++) {
				if(die[j]) {
					continue;
				}
				
				if(s[j].charAt(i) == lose) {
					die[j] = true;
					liveCount--;
				}
			}
		}
		
		if(liveCount != 1) {
			return 0;
		}
		
		for(int i = 0; i < die.length; i++) {
			if(!die[i]) {
				return i + 1;
			}
		}
		return 0;
	}
}
