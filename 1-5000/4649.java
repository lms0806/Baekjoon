import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String s = br.readLine();
			
			if(s.equals("0")) {
				break;
			}
			
			StringTokenizer st = new StringTokenizer(s);
			int num = Integer.parseInt(st.nextToken());
			
			HashSet<Character> set = new HashSet<>();
			
			int answer = 0;
			for(char c : st.nextToken().toCharArray()) {
				if(set.contains(c)) {
					set.remove(c);
				}
				else {
					if(set.size() == num) {
						answer++;
					}
					else {
						set.add(c);
					}
				}
			}
			
			sb.append(answer == 0 ? "All customers tanned successfully." : answer / 2 + " customer(s) walked away.").append("\n");
		}
		System.out.print(sb);
	}
}
