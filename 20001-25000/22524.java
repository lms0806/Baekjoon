import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] ch = {'y', 'u', 'i', 'o', 'p', 'h', 'j', 'k', 'l', 'n', 'm'};
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String s = br.readLine();
			
			if(s.equals("#")) {
				break;
			}
			
			int answer = 0, num = -1;
			for(char c : s.toCharArray()) {
				boolean flag = true;
				for(int i = 0; i < ch.length; i++) {
					if(c == ch[i]) {
						if(num == 2) {
							answer++;
						}
						num = 1;
						flag = false;
						break;
					}
				}
				
				if(flag) {
					if(num == 1) {
						answer++;
					}
					num = 2;
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
