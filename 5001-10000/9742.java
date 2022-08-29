import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int num, count;
	static String answer = "";
	static boolean[] visited;
	static char[] ch;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		StringBuilder sb = new StringBuilder();
		while((str = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(str);
			String s = st.nextToken();
			
			ch = new char[s.length()];
			visited = new boolean[s.length()];
			for(int i = 0; i < s.length(); i++) {
				ch[i] = s.charAt(i);
			}
			
			answer = "";
			count = 0;
			num = Integer.parseInt(st.nextToken());
			
			dfs(new StringBuilder(), 0);
			
			sb.append(s).append(" ").append(num).append(" = ");
			sb.append(answer.equals("") ? "No permutation" : answer).append("\n");
		}
		System.out.println(sb);
	}
	
	public static void dfs(StringBuilder sb, int depth) {
		if(depth == ch.length) {
			count++;
			if(count == num) {
				answer = sb.toString();
			}
			return;
		}
		
		if(!answer.equals("")) {
			return;
		}
		
		for(int i = 0; i < ch.length; i++) {
			if(!visited[i]) {
				visited[i] = true;
                sb.append(ch[i]);
				dfs(sb, depth + 1);
                sb.setLength(sb.length() - 1);
				visited[i] = false;
			}
		}
	}
}
