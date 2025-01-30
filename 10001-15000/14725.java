import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Trie trieSet = new Trie();
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			st.nextToken();
		
			StringBuilder sb = new StringBuilder();
			while(st.hasMoreTokens()) {
				sb.append(st.nextToken()).append(" ");
			}
			trieSet.insert(sb.toString());
		}
		trieSet.print(trieSet, 0);
	}
}

class Trie {
	Map<String, Trie> child = new TreeMap<>();
	
	void insert(String word) {
		Trie curNode = this;
		String[] str = word.split(" ");
		for(String s : str) {
			curNode.child.putIfAbsent(s, new Trie());
			curNode = curNode.child.get(s);
		}
	}
	
	public void print(Trie trie, int depth) {
		Trie now = trie;
		if(now.child != null) {
			for(String key : now.child.keySet()) {
				StringBuilder sb = new StringBuilder();
				for(int i = 0; i < depth; i++) {
					sb.append("--");
				}
				sb.append(key);
				System.out.println(sb);
				print(trie.child.get(key), depth + 1);
			}
		}
	}
}
