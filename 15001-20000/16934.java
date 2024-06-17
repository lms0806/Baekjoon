import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Trie trieSet = new Trie();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {			
			sb.append(trieSet.insert(br.readLine())).append("\n");
		}
		System.out.print(sb);
	}
}

class Trie{
	Map<Character, Trie> childNode = new HashMap<>();
	int end = 0;

	Trie(){}

	public String insert(String word) {
		Trie trieNode = this;
		boolean endFlag = false;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);

			if(!trieNode.childNode.containsKey(c)) {
				trieNode.childNode.put(c, new Trie());
				
				if(!endFlag) {
					sb.append(c);
					endFlag = true;
				}
			}
			else {
				sb.append(c);
			}
			trieNode = trieNode.childNode.get(c);
		}
		
		if(trieNode.end == 0) {
			trieNode.end = 1;
			return sb.toString();
		}
		else {
			trieNode.end++;
			return sb.toString() + trieNode.end;
		}
	}
}
