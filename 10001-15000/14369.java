import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcase = Integer.parseInt(br.readLine());
		
		ArrayList<Node> arr = new ArrayList<>();
		arr.add(new Node(0, 'Z', "ZERO"));
		arr.add(new Node(6, 'X', "SIX"));
		arr.add(new Node(8, 'G', "EIGHT"));
		arr.add(new Node(7, 'S', "SEVEN"));
		arr.add(new Node(5, 'V', "FIVE"));
		arr.add(new Node(4, 'F', "FOUR"));
		arr.add(new Node(9, 'I', "NINE"));
		arr.add(new Node(2, 'W', "TWO"));
		arr.add(new Node(3, 'R', "THREE"));
		arr.add(new Node(1, 'O', "ONE"));
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= testcase; t++) {
			int[] alpha = new int[26];
			
			for(char c : br.readLine().toCharArray()) {
				alpha[c - 'A']++;
			}
			
			ArrayList<Integer> answer = new ArrayList<>();
			for(int i = 0; i < arr.size(); i++) {
				if(alpha[arr.get(i).c - 'A'] > 0) {
					String s = arr.get(i).name;
					int size = alpha[arr.get(i).c - 'A'];
					
					for(int j = 0; j < size; j++) {
						answer.add(arr.get(i).num);
					}
					
					for(char c : s.toCharArray()) {
						alpha[c - 'A'] -= size;
					}
				}
			}
			
			Collections.sort(answer);
			
			sb.append("Case #").append(t).append(": ");
			for(int a : answer) {
				sb.append(a);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}

class Node{
	int num;
	char c;
	String name;
	
	public Node(int num, char c, String name) {
		this.num = num;
		this.c = c;
		this.name = name;
	}
}
