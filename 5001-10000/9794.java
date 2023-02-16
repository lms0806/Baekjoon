import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		String s;
		ArrayList<Node> arr = new ArrayList<>();
		while((s = br.readLine()) != null) {
			int sum = 0;
			HashSet<Character> set = new HashSet<>();
			for(int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				int number = c - 'a' + 1;
				
				sum += number;
				
				if(i > 0 && c == s.charAt(i - 1) && !set.contains(c)) {
					sum += (number) * 2;
					set.add(c);
				}
			}
			
			arr.add(new Node(s, sum));
		}
		
		Collections.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for(Node a : arr) {
			sb.append(a.s).append("\n");
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node>{
	String s;
	int num;
	
	public Node(String s, int num) {
		this.s = s;
		this.num = num;
	}

	@Override
	public int compareTo(Node o) {
		if(this.num == o.num) {
			return this.s.compareTo(o.s);
		}
		return o.num - this.num;
	}
}
