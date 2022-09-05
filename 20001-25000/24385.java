import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
	static int n;
	static int[] alpha = new int[26];
	static TreeSet<String> set = new TreeSet<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(char c : br.readLine().toCharArray()) {
			alpha[c - 'a']++;
			n++;
		}
		
		dfs(new StringBuilder(), 0);
		
		StringBuilder sb = new StringBuilder();
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			sb.append(iter.next()).append("\n");
		}
		System.out.print(sb);
	}
	
	public static void dfs(StringBuilder sb, int depth) {
		if(depth == n) {
			set.add(sb.toString());
			return;
		}
		
		for(int i = 0; i < 26; i++) {
			if(alpha[i] > 0) {
				alpha[i]--;
				sb.append((char)(i + 'a'));
				dfs(sb, depth + 1);
				sb.setLength(sb.length() - 1);
				alpha[i]++;
			}
		}
	}
}
