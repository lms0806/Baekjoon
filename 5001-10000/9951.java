import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String s = br.readLine().toLowerCase();
			
			if(s.equals("#")) {
				break;
			}
			
			StringTokenizer st = new StringTokenizer(s);
			
			TreeSet<String> set = new TreeSet<>();
			while(st.hasMoreTokens()) {
				StringBuilder collect = new StringBuilder();
				for(char c : st.nextToken().toCharArray()) {
					if(c >= 'a' && c <= 'z') {
						collect.append(c);
					}
					else if(c >= '0' && c <= '9' && collect.length() != 0) {
						collect.append(c);
					}
				}
				
				if(collect.length() != 0) {
					set.add(collect.toString());
				}
			}
			
			for(String str : set) {
				sb.append(str).append("\n");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
