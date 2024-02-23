import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Trie tireSet = new Trie();
		for(int i = 0; i < n; i++) {
			tireSet.insert(br.readLine());
		}
		
		tireSet.computeFailFunc();
		
		int q = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < q; i++) {
			sb.append(tireSet.ahoCorasick(br.readLine()) ? "YES" : "NO").append("\n");
		}
		System.out.print(sb);
	}
}

class Trie {
	Map<Character, Trie> child = new HashMap<>();
	boolean output;
	Trie fail;
	
	void insert(String word) {
		Trie curNode = this;
		for(int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			
			curNode.child.putIfAbsent(c, new Trie());
			curNode = curNode.child.get(c);
			
			if(i == word.length() - 1) {
				curNode.output = true;
			}
		}
	}
	
	public void computeFailFunc() {
		Queue<Trie> queue = new LinkedList<>();
		this.fail = this;
		queue.add(this);
		
		while(!queue.isEmpty()) {
			Trie cur = queue.poll();
			for(int i = 0; i < 26; i++) {
				char c = (char)(i + 97);
				
				Trie nxt = cur.child.get(c);
				if(nxt == null) continue;
				
				if(cur == this) { 
					nxt.fail = this;
				}else {  
					Trie failLinkNode = cur.fail;
					while(failLinkNode != this && failLinkNode.child.get(c) == null) {
						failLinkNode = failLinkNode.fail;
					}
					
					if(failLinkNode.child.get(c) != null) {
						failLinkNode = failLinkNode.child.get(c);
					}
					
					nxt.fail = failLinkNode;
				}
				
				if(nxt.fail.output) {
					nxt.output = true;
				}
				queue.add(nxt);
			}
		}
	}
	
	public boolean ahoCorasick(String word) {
		Trie curNode = this;
		for(int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			while(curNode != this && curNode.child.get(c) ==null) {
				curNode = curNode.fail;
			}
			if(curNode.child.get(c)!=null) {
				curNode = curNode.child.get(c);
			}
			
			if(curNode.output) {
				return true;
			}
		}
		return false;
	}
}
