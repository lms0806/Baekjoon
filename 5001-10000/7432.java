import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class Main {
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Trie trie = new Trie();
		while(n --> 0) {
			trie.insert(br.readLine());
		}
		
		trie.print(trie, 0);
		
		System.out.print(sb);
	}
	
	public static class Trie {
		TreeMap<String, Trie> child = new TreeMap<>();
		
		public void insert(String words) {
			Trie curNode = this;
			for(String word : words.split("\\\\")) {
				curNode.child.putIfAbsent(word, new Trie());
				curNode = curNode.child.get(word);
			}
		}
		
		public void print(Trie cur, int depth) {
			Trie trieNode = cur;
			if(trieNode.child !=null) {
				ArrayList<String> list = new ArrayList<>(trieNode.child.keySet());
				
				Collections.sort(list);
				
				for(String str : list) {
					for(int i = 0; i < depth; i++) {
						sb.append(" ");
					}
					sb.append(str).append("\n");
					
					print(trieNode.child.get(str), depth + 1);
				}
			}
		}
	}
}
