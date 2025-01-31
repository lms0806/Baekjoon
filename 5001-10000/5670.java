import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s;
		StringBuilder sb = new StringBuilder();
		while((s = br.readLine()) != null) {
			int n = Integer.parseInt(s);
			
			String[] str = new String[n];
			
			Trie trie = new Trie();
			for(int i = 0; i < n; i++) {
				str[i] = br.readLine();
				
				trie.insert(str[i]);
			}
			
			double sum = 0;
			for(String st : str) {
				sum += trie.search(st);
			}
			sb.append(String.format("%.2f", sum / n)).append("\n");
		}
		System.out.print(sb);
	}
}

class Trie {
	Map<Character, Trie> child = new HashMap<>();
	boolean check;
	
	public void insert(String word) {
		Trie curNode = this;
		for(int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			
			curNode.child.putIfAbsent(c, new Trie());
			curNode = curNode.child.get(c);
			
			if(i == word.length() - 1) {
				curNode.check = true;
			}
		}
	}
	
	public int search(String word) {
		int count = 0;
		Trie trieNode = this;
		for(int i=0; i<word.length(); i++) {
			char c = word.charAt(i);
			Trie node = trieNode.child.get(c);
			
			if(i == 0 || trieNode.check || trieNode.child.size() > 1) {
				count++;
			}
			
			trieNode = node;
		}
		return count;
	}
}
