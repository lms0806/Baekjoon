import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Main {
	static TreeSet<String> set = new TreeSet<>();
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s;
		Trie trie = new Trie();
		while((s = br.readLine()) != null) {
			set.add(s);
			trie.insert(s);
		}
		
		StringBuilder sb = new StringBuilder();
		for(String str : set) {
			if(trie.search(str)) {
				sb.append(str).append("\n");
			}
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
				
				if(node.check && !word.equals(word.substring(i + 1)) && set.contains(word.substring(i + 1))) {
					return true;
				}
				
				trieNode = node;
			}
			return false;
		}
	}
}
