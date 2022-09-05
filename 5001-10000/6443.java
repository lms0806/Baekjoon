import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
	static int n;
	static int[] alpha;
	static TreeSet<String> set;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			alpha = new int[26];
			
			n = 0;
			for(char c : br.readLine().toCharArray()) {
				alpha[c - 'a']++;
				n++;
			}
			
			set = new TreeSet<>();
			
			dfs(new StringBuilder(), 0);
			
			Iterator<String> iter = set.iterator();
			while(iter.hasNext()) {
				sb.append(iter.next()).append("\n");
			}
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
