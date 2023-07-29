import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= size; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			
			Trie trie = new Trie();
			while(n --> 0) {
				String[] str = change(br.readLine());
				
				String s = "";
				for(int i = 1; i < str.length; i++) {
					trie.insert(s += str[i] + "/");
				}
			}
			
			int answer = 0;
			while(m --> 0) {
				String[] str = change(br.readLine());
				
				String s = "";
				for(int i = 1; i < str.length; i++) {
					if(!trie.search(s += str[i] + "/")) {
						trie.insert(s);
						answer++;
					}
				}
			}
			sb.append("Case #").append(t).append(": ").append(answer).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String[] change(String s) {
		return s.split("/");
	}
}

class Trie{
	Node rootNode = new Node();
	
	void insert(String s) {
		Node node = this.rootNode;
		
		for(int i = 0; i < s.length(); i++) {
			node = node.childNode.computeIfAbsent(s.charAt(i), key -> new Node());
		}
		
		node.endword = true;
	}
	
	boolean search(String s) {
		Node node = this.rootNode;
		
		for(int i = 0; i < s.length(); i++) {
			node = node.childNode.getOrDefault(s.charAt(i), null);
			
			if(node == null) {
				return false;
			}
		}
		return node.endword;
	}
}

class Node{
	Map<Character, Node> childNode = new HashMap<>();
	boolean endword;
}
