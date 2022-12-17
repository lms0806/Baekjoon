import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String strs = st.nextToken();
			String[] str = strs.split("");
			int n = Integer.parseInt(st.nextToken());
			
			sb.append(strs).append("\n");
			while(n --> 0) {
				String[] s = br.readLine().split(" ");
				
				if(s.length == str.length) {
					boolean flag = true;
					for(int i = 0; i < s.length; i++) {
						if(!s[i].startsWith(str[i])) {
							flag = false;
							break;
						}
					}
					
					if(flag) {
						for(String ss : s) {
							sb.append(ss).append(" ");
						}
						sb.append("\n");
					}
				}
			}
		}
		System.out.print(sb);
	}
}
