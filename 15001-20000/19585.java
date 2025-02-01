import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	static HashSet<String> set = new HashSet<>();
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		Trie trie = new Trie();
		while(n --> 0) {
			trie.insert(br.readLine());
		}
		
		while(m --> 0) {
			set.add(br.readLine());
		}
		
		int q = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(q --> 0) {
			sb.append(trie.search(br.readLine()) ? "Yes" : "No").append("\n");
		}
		System.out.print(sb);
	}
	
	public static class Trie {
		Trie[] child = new Trie[26];
		boolean check;
		
		public void insert(String word) {
			Trie curNode = this;
			for(char c : word.toCharArray()) {			
				if(curNode.child[c - 'a'] == null) {
					curNode.child[c - 'a'] = new Trie();
				}
				curNode = curNode.child[c - 'a'];
			}
			curNode.check = true;
		}
		
		public boolean search(String word) {
			Trie trieNode = this;
			for(int i = 0; i < word.length(); i++) {
				char c = word.charAt(i);
				Trie node = trieNode.child[c - 'a'];
				
				if(node == null) {
					return false;
				}
				
				if(node.check && set.contains(word.substring(i + 1))) {
					return true;
				}
				
				trieNode = node;
			}
			return false;
		}
	}
}
